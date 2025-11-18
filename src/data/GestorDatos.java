package data;

import model.CentroCultivo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Clase responsable de leer los datos desde el archivo TXT
 * y convertirlos en objetos CentroCultivo.
 */
public class GestorDatos {

    /**
     * Lee el archivo centros.txt ubicado en la carpeta resources.
     * Crea objetos CentroCultivo y los almacena en un ArrayList.
     *
     * @return lista de centros de cultivo cargados desde el archivo
     */
    public ArrayList<CentroCultivo> cargarCentros() {

        // Lista donde almacenaremos cada objeto leído del archivo
        ArrayList<CentroCultivo> lista = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(
                // Carga el archivo desde resources usando getResourceAsStream
                new InputStreamReader(getClass().getResourceAsStream("/centros.txt"))
        )) {
            String linea;

            // Lee el archivo línea por línea
            while ((linea = br.readLine()) != null) {

                // Separa los datos por punto y coma
                String[] partes = linea.split(";");

                // Extrae cada dato desde el arreglo
                String nombre = partes[0];
                String ubicacion = partes[1];
                int produccion = Integer.parseInt(partes[2]);

                // Crea un nuevo objeto con la línea procesada
                CentroCultivo centro = new CentroCultivo(nombre, ubicacion, produccion);

                // Lo agrega a la lista
                lista.add(centro);
            }

        } catch (Exception e) {
            // Mensaje si ocurre algún error
            System.out.println("Error al leer archivo: " + e.getMessage());
        }

        // Retorna la lista con todos los centros cargados
        return lista;
    }
}
