package app;

import data.GestorDatos;
/**
 * Clase principal del sistema SalmonttApp.
 * Ejecuta la carga de datos y muestra la información procesada en consola.
 */
public class Main {

    /**
     * Método principal (punto de entrada del programa).
     * @param args argumentos de línea de comandos (no utilizados)
     */
    public static void main(String[] args) {

        // Instancia del gestor de datos
        GestorDatos gestor = new GestorDatos();

        // Carga los datos iniciales (desde archivos y registros de prueba)
        gestor.cargarDatosIniciales();

        // Muestra los datos en consola aplicando polimorfismo
        gestor.mostrarRegistros();
    }
}
