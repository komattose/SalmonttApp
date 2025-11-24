package app;

import model.CentroCultivo;
import service.CentroService;
import util.Validador;

import java.util.List;
import java.util.Scanner;

/**
 * Clase principal del sistema Salmontt.
 * Contiene un menú completo (tipo C) con submenús.
 */
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        CentroService servicio = new CentroService();

        int opcion;

        do {
            mostrarMenuPrincipal();
            opcion = leerEntero(scanner);

            switch (opcion) {

                case 1:
                    menuGestionCentros(scanner, servicio);
                    break;

                case 2:
                    menuBusquedas(scanner, servicio);
                    break;

                case 3:
                    menuFiltros(scanner, servicio);
                    break;

                case 4:
                    menuInformacion(scanner, servicio);
                    break;

                case 0:
                    System.out.println("\nSaliendo del sistema... ¡Hasta luego!");
                    break;

                default:
                    System.out.println("❌ Opción no válida.");
            }

        } while (opcion != 0);
    }

    // ============================================================
    // MENU PRINCIPAL
    // ============================================================

    private static void mostrarMenuPrincipal() {
        System.out.println("\n===== SISTEMA DE GESTIÓN SALMONTT =====");
        System.out.println("1. Gestión de Centros");
        System.out.println("2. Búsquedas");
        System.out.println("3. Filtros Avanzados");
        System.out.println("4. Información General");
        System.out.println("0. Salir");
        System.out.print("Seleccione una opción: ");
    }

    private static int leerEntero(Scanner scanner) {
        String input = scanner.nextLine();
        if (Validador.esEnteroPositivo(input)) {
            return Integer.parseInt(input);
        }
        return -1;
    }

    // ============================================================
    // SUBMENÚ 1: GESTIÓN DE CENTROS
    // ============================================================

    private static void menuGestionCentros(Scanner scanner, CentroService servicio) {

        int opcion;

        do {
            System.out.println("\n--- GESTIÓN DE CENTROS ---");
            System.out.println("1. Ver todos los centros");
            System.out.println("2. Ver detalle de un centro");
            System.out.println("3. Actualizar producción");
            System.out.println("4. Listar centros por región");
            System.out.println("0. Volver");
            System.out.print("Seleccione una opción: ");

            opcion = leerEntero(scanner);

            switch (opcion) {
                case 1:
                    listar(servicio.listarCentros());
                    break;

                case 2:
                    System.out.print("Ingrese nombre del centro: ");
                    String nombre = scanner.nextLine();
                    CentroCultivo c = servicio.buscarPorNombre(nombre);
                    if (c != null) {
                        System.out.println(c);
                    } else {
                        System.out.println("❌ No encontrado.");
                    }
                    break;

                case 3:
                    System.out.print("Nombre del centro: ");
                    String nom = scanner.nextLine();

                    System.out.print("Nueva producción: ");
                    String prod = scanner.nextLine();

                    if (Validador.esEnteroPositivo(prod)) {
                        if (servicio.actualizarProduccion(nom, Integer.parseInt(prod))) {
                            System.out.println("✔ Producción actualizada.");
                        } else {
                            System.out.println("❌ Centro no encontrado.");
                        }
                    } else {
                        System.out.println("❌ Producción inválida.");
                    }
                    break;

                case 4:
                    System.out.print("Ingrese región: ");
                    String region = scanner.nextLine();
                    listar(servicio.buscarPorRegion(region));
                    break;

                case 0:
                    break;

                default:
                    System.out.println("❌ Opción no válida.");
            }

        } while (opcion != 0);
    }

    // ============================================================
    // SUBMENÚ 2: BÚSQUEDAS
    // ============================================================

    private static void menuBusquedas(Scanner scanner, CentroService servicio) {

        int opcion;

        do {
            System.out.println("\n--- BUSQUEDAS ---");
            System.out.println("1. Buscar por nombre");
            System.out.println("2. Buscar por ciudad");
            System.out.println("3. Buscar por encargado");
            System.out.println("0. Volver");
            System.out.print("Opción: ");

            opcion = leerEntero(scanner);

            switch (opcion) {
                case 1:
                    System.out.print("Nombre del centro: ");
                    String n = scanner.nextLine();
                    CentroCultivo c = servicio.buscarPorNombre(n);
                    System.out.println(c != null ? c : "❌ No encontrado.");
                    break;

                case 2:
                    System.out.print("Ciudad: ");
                    listar(servicio.buscarPorCiudad(scanner.nextLine()));
                    break;

                case 3:
                    System.out.print("Nombre del encargado: ");
                    listar(servicio.buscarPorEncargado(scanner.nextLine()));
                    break;

                case 0:
                    break;

                default:
                    System.out.println("❌ Opción no válida.");
            }

        } while (opcion != 0);
    }

    // ============================================================
    // SUBMENÚ 3: FILTROS AVANZADOS
    // ============================================================

    private static void menuFiltros(Scanner scanner, CentroService servicio) {

        int opcion;

        do {
            System.out.println("\n--- FILTROS AVANZADOS ---");
            System.out.println("1. Producción >= X");
            System.out.println("2. Producción <= X");
            System.out.println("3. Rango de producción");
            System.out.println("4. Ordenar por producción");
            System.out.println("0. Volver");
            System.out.print("Seleccione: ");

            opcion = leerEntero(scanner);

            switch (opcion) {

                case 1:
                    System.out.print("Producción mínima: ");
                    listar(servicio.filtrarProduccionMinima(leerEntero(scanner)));
                    break;

                case 2:
                    System.out.print("Producción máxima: ");
                    listar(servicio.filtrarProduccionMaxima(leerEntero(scanner)));
                    break;

                case 3:
                    System.out.print("Min: ");
                    int min = leerEntero(scanner);
                    System.out.print("Max: ");
                    int max = leerEntero(scanner);
                    listar(servicio.filtrarRango(min, max));
                    break;

                case 4:
                    System.out.println("1. Ascendente");
                    System.out.println("2. Descendente");
                    System.out.print("Opción: ");
                    int ord = leerEntero(scanner);
                    listar(servicio.ordenarPorProduccion(ord == 1));
                    break;

                case 0:
                    break;

                default:
                    System.out.println("❌ Opción no válida.");
            }

        } while (opcion != 0);
    }

    // ============================================================
    // SUBMENÚ 4: INFORMACIÓN GENERAL
    // ============================================================

    private static void menuInformacion(Scanner scanner, CentroService servicio) {

        int opcion;

        do {
            System.out.println("\n--- INFORMACION GENERAL ---");
            System.out.println("1. Total de centros");
            System.out.println("2. Producción total");
            System.out.println("3. Producción promedio");
            System.out.println("4. Región con más centros");
            System.out.println("5. Listar regiones");
            System.out.println("0. Volver");
            System.out.print("Seleccione: ");

            opcion = leerEntero(scanner);

            switch (opcion) {
                case 1:
                    System.out.println("Total: " + servicio.totalCentros());
                    break;

                case 2:
                    System.out.println("Producción total: " + servicio.produccionTotal());
                    break;

                case 3:
                    System.out.println("Promedio: " + servicio.produccionPromedio());
                    break;

                case 4:
                    System.out.println("Región con más centros: " + servicio.regionConMasCentros());
                    break;

                case 5:
                    System.out.println("Regiones registradas:");
                    servicio.listarRegionesUnicas().forEach(r -> System.out.println("- " + r));
                    break;

                case 0:
                    break;

                default:
                    System.out.println("❌ Opción no válida.");
            }

        } while (opcion != 0);
    }

    // ============================================================
    // MÉTODO AUXILIAR PARA LISTAR RESULTADOS
    // ============================================================

    private static void listar(List<CentroCultivo> lista) {

        if (lista == null || lista.isEmpty()) {
            System.out.println("❌ No se encontraron resultados.");
            return;
        }

        for (CentroCultivo c : lista) {
            System.out.println(c);
        }
    }
}
