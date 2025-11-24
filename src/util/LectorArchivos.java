package util;

import model.CentroCultivo;
import model.Direccion;
import model.Encargado;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Clase responsable de leer el archivo centros.txt ubicado en resources.
 * Usa validaciones y composición para crear objetos completos.
 */
public class LectorArchivos {

    /**
     * Lee el archivo y retorna una lista de Centros de Cultivo.
     */
    public static ArrayList<CentroCultivo> cargarCentrosDesdeArchivo() {

        ArrayList<CentroCultivo> lista = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(
                        LectorArchivos.class.getResourceAsStream("/centros.txt")
                )
        )) {
            String linea;

            while ((linea = br.readLine()) != null) {

                // Cada línea debe tener 6 valores separados por ";"
                String[] partes = linea.split(";");

                if (partes.length != 6) {
                    System.out.println("⚠ Línea inválida (se ignorará): " + linea);
                    continue;
                }

                // Extracción de datos
                String nombreCentro = partes[0];
                String ciudad = partes[1];
                String produccionStr = partes[2];
                String calle = partes[3];
                String region = partes[4];
                String nombreEncargado = partes[5];

                // Validación de producción
                if (!Validador.esEnteroPositivo(produccionStr)) {
                    System.out.println("⚠ Producción inválida: " + produccionStr);
                    continue;
                }

                int produccion = Validador.convertirEntero(produccionStr);

                // Crear objetos compuestos
                Direccion direccion = new Direccion(calle, region);
                Encargado encargado = new Encargado(nombreEncargado);

                // Crear centro final
                CentroCultivo centro = new CentroCultivo(
                        nombreCentro,
                        ciudad,
                        produccion,
                        direccion,
                        encargado
                );

                lista.add(centro);
            }

        } catch (Exception e) {
            System.out.println("❌ Error al leer archivo: " + e.getMessage());
        }

        return lista;
    }
}
