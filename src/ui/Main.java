package ui;

import data.GestorDatos;
import model.CentroCultivo;

import java.util.ArrayList;

/**
 * Clase principal del programa.
 * Se encarga de ejecutar el flujo:
 * 1. Leer los datos
 * 2. Mostrar todos los centros
 * 3. Filtrar producción mayor a 1000
 */
public class Main {

    public static void main(String[] args) {

        // Crea un gestor que leerá los datos desde el archivo
        GestorDatos gestor = new GestorDatos();

        // Llama al método para cargar los centros a un ArrayList
        ArrayList<CentroCultivo> centros = gestor.cargarCentros();

        // 1. Mostrar todos los centros cargados
        System.out.println("=== LISTA COMPLETA DE CENTROS ===");
        for (CentroCultivo c : centros) {
            System.out.println(c);
        }

        // 2. Filtrar centros con producción superior a 1000 toneladas
        System.out.println("\n=== CENTROS CON PRODUCCIÓN > 1000 ===");
        centros.stream()
                .filter(c -> c.getProduccion() > 1000)   // Condición de filtrado
                .forEach(System.out::println);           // Por cada centro filtrado, imprimirlo
    }
}
