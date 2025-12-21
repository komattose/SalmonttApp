package utils;

/**
 * Clase utilitaria que valida el formato y dígito verificador del RUT chileno.
 */
public class ValidadorRut {

    /**
     * Valida un RUT con formato XX.XXX.XXX-X o sin puntos.
     * @param rut Cadena que contiene el RUT
     * @return true si el RUT es válido, false si no lo es
     */
    public static boolean validar(String rut) {
        if (rut == null || !rut.matches("\\d{1,2}\\.\\d{3}\\.\\d{3}-[\\dkK]")) {
            return false;
        }

        rut = rut.replace(".", "").toUpperCase();
        String cuerpo = rut.split("-")[0];
        char dv = rut.split("-")[1].charAt(0);

        int suma = 0, factor = 2;

        for (int i = cuerpo.length() - 1; i >= 0; i--) {
            suma += Character.getNumericValue(cuerpo.charAt(i)) * factor;
            factor = (factor == 7) ? 2 : factor + 1;
        }

        int resto = 11 - (suma % 11);
        char dvEsperado;
        if (resto == 11) dvEsperado = '0';
        else if (resto == 10) dvEsperado = 'K';
        else dvEsperado = Character.forDigit(resto, 10);

        return dv == dvEsperado;
    }
}
