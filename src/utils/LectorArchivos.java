package utils;

import model.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase encargada de leer archivos externos (.txt)
 * y convertir sus líneas en objetos del sistema.
 */
public class LectorArchivos {

    /**
     * Lee un archivo de empleados.txt en formato:
     * nombre;rut;calle;ciudad;region;cargo;salario
     */
    public static List<Empleado> leerEmpleados(String rutaArchivo) {
        List<Empleado> empleados = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(";");
                if (datos.length == 7) {
                    String nombre = datos[0];
                    Rut rut = new Rut(datos[1]);
                    Direccion dir = new Direccion(datos[2], datos[3], datos[4]);
                    String cargo = datos[5];
                    double salario = Double.parseDouble(datos[6]);

                    empleados.add(new Empleado(nombre, rut, dir, cargo, salario));
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer empleados.txt: " + e.getMessage());
        }

        return empleados;
    }

    /**
     * Lee un archivo de productos.txt en formato:
     * nombre;precio
     */
    public static List<Producto> leerProductos(String rutaArchivo) {
        List<Producto> productos = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(";");
                if (datos.length == 2) {
                    String nombre = datos[0];
                    double precio = Double.parseDouble(datos[1]);
                    productos.add(new Producto(nombre, precio));
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer productos.txt: " + e.getMessage());
        }

        return productos;
    }
}
