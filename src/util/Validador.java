package util;

/**
 * Clase de utilidades encargada de validar entradas y datos.
 * Esta clase centraliza todas las validaciones básicas del sistema.
 */
public class Validador {

    /**
     * Valida si un String NO está vacío ni nulo.
     */
    public static boolean esTextoValido(String texto) {
        return texto != null && !texto.trim().isEmpty();
    }

    /**
     * Valida si una cadena representa un número entero válido y positivo.
     */
    public static boolean esEnteroPositivo(String numero) {
        try {
            int valor = Integer.parseInt(numero);
            return valor >= 0;
        } catch (NumberFormatException e) {
            return false; // si falla la conversión, no es válido
        }
    }

    /**
     * Convierte un texto a entero seguro.
     */
    public static int convertirEntero(String numero) {
        try {
            return Integer.parseInt(numero);
        } catch (Exception e) {
            return -1; // señal de error
        }
    }

    /**
     * Valida un rango mínimo → máximo.
     */
    public static boolean esRangoValido(int minimo, int maximo) {
        return minimo <= maximo;
    }
}

