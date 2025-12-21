package data;

import model.*;
import utils.LectorArchivos;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase GestorDatos
 * -----------------
 * Gestiona las colecciones de objetos del sistema SalmonttApp.
 * Carga información desde los archivos ubicados en la carpeta /resources,
 * creando instancias de distintas entidades del dominio (empleados.txt, productos.txt, clientes, proveedores).
 *
 * Esta clase demuestra el uso combinado de:
 * - Encapsulamiento
 * - Colecciones dinámicas (ArrayList)
 * - Polimorfismo
 * - Composición y herencia
 */
public class GestorDatos {

    /** Lista polimórfica que almacena todos los registros del sistema */
    private final List<Registrable> registros;

    /** Constructor: inicializa la colección vacía */
    public GestorDatos() {
        registros = new ArrayList<>();
    }

    /**
     * Carga los datos iniciales desde archivos .txt y agrega registros de prueba.
     * Si los archivos no se encuentran en el classpath, se intentan buscar en la carpeta /resources del proyecto.
     */
    public void cargarDatosIniciales() {
        try {
            // Busca rutas de recursos (empleados.txt y productos.txt)
            String empleadosPath = obtenerRutaRecurso("empleados.txt");
            String productosPath = obtenerRutaRecurso("productos.txt");

            // Carga datos desde los archivos de texto
            registros.addAll(LectorArchivos.leerEmpleados(empleadosPath));
            registros.addAll(LectorArchivos.leerProductos(productosPath));

            // Agrega registros adicionales manualmente
            registros.add(new Cliente(
                    "Juan Pérez",
                    new Rut("11.111.111-1"),
                    new Direccion("Av. Los Salmones 123", "Puerto Montt", "Los Lagos"),
                    new Tarjeta("Visa", "1234-5678-9101-1121")
            ));

            registros.add(new Proveedor(
                    "Carlos Muñoz",
                    new Rut("22.222.222-2"),
                    new Direccion("Ruta 5 Sur 321", "Puerto Varas", "Los Lagos"),
                    "AquaFeed Ltda"
            ));

        } catch (Exception e) {
            System.out.println("Error al cargar los datos: " + e.getMessage());
        }
    }

    /**
     * Muestra todos los registros almacenados, aplicando polimorfismo en las entidades.
     */
    public void mostrarRegistros() {
        System.out.println("\n=== Sistema SalmonttApp ===\n");
        for (Registrable r : registros) {
            r.mostrarDatos();
            System.out.println("→ Registro tipo " + r.getClass().getSimpleName() + "\n");
        }
        System.out.println("=== Fin de la demostración ===");
    }

    /**
     * Devuelve la lista completa de registros.
     * @return lista de objetos que implementan la interfaz Registrable
     */
    public List<Registrable> getRegistros() {
        return registros;
    }

    /**
     * Obtiene la ruta absoluta de un archivo dentro del classpath (/resources),
     * o busca una ruta alternativa en caso de que no se encuentre en el classloader.
     *
     * @param nombreArchivo nombre del archivo, por ejemplo "empleados.txt.txt"
     * @return ruta absoluta del archivo dentro del sistema de archivos
     */
    private String obtenerRutaRecurso(String nombreArchivo) {
        // Intentar obtener el archivo desde el classpath (out/production/SalmonttApp)
        URL recurso = getClass().getClassLoader().getResource(nombreArchivo);
        if (recurso != null) {
            return recurso.getPath().replace("%20", " ");
        }

        // Si no está en el classpath, usar la carpeta /resources como alternativa
        String rutaAlternativa = System.getProperty("user.dir") + File.separator + "resources" + File.separator + nombreArchivo;
        File archivoAlternativo = new File(rutaAlternativa);
        if (archivoAlternativo.exists()) {
            System.out.println("Advertencia: usando ruta alternativa → " + rutaAlternativa);
            return rutaAlternativa;
        }

        // Si tampoco existe, lanzar excepción clara
        throw new RuntimeException("No se encontró el archivo: " + nombreArchivo);
    }
}
