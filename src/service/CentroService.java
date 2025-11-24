package service;

import model.CentroCultivo;

import util.LectorArchivos;
import util.Validador;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Clase encargada de toda la lógica del sistema:
 * - Cargar datos desde archivo
 * - Búsquedas simples
 * - Filtros avanzados
 * - Ordenamientos
 * - Estadísticas
 */
public class CentroService {

    private ArrayList<CentroCultivo> centros;

    /**
     * Al crear el servicio, se cargan automáticamente los datos desde el archivo.
     */
    public CentroService() {
        centros = LectorArchivos.cargarCentrosDesdeArchivo();
    }

    // ============================================================
    // METODOS DE LISTADO
    // ============================================================

    /**
     * Devuelve todos los centros registrados.
     */
    public ArrayList<CentroCultivo> listarCentros() {
        return centros;
    }


    // ============================================================
    // METODOS DE BUSQUEDA
    // ============================================================

    /**
     * Busca centro por nombre exacto.
     */
    public CentroCultivo buscarPorNombre(String nombre) {
        for (CentroCultivo c : centros) {
            if (c.getNombre().equalsIgnoreCase(nombre)) {
                return c;
            }
        }
        return null; // no encontrado
    }

    /**
     * Busca centros por ciudad.
     */
    public List<CentroCultivo> buscarPorCiudad(String ciudad) {
        return centros.stream()
                .filter(c -> c.getCiudad().equalsIgnoreCase(ciudad))
                .collect(Collectors.toList());
    }

    /**
     * Busca centros por región.
     */
    public List<CentroCultivo> buscarPorRegion(String region) {
        return centros.stream()
                .filter(c -> c.getDireccion().getRegion().equalsIgnoreCase(region))
                .collect(Collectors.toList());
    }

    /**
     * Busca centros donde el encargado coincida con el nombre dado.
     */
    public List<CentroCultivo> buscarPorEncargado(String nombreEncargado) {
        return centros.stream()
                .filter(c -> c.getEncargado().getNombre().equalsIgnoreCase(nombreEncargado))
                .collect(Collectors.toList());
    }


    // ============================================================
    // ACTUALIZACION DE PRODUCCION
    // ============================================================

    /**
     * Actualiza la producción de un centro.
     */
    public boolean actualizarProduccion(String nombreCentro, int nuevaProduccion) {

        if (!Validador.esEnteroPositivo(String.valueOf(nuevaProduccion)))
            return false;

        CentroCultivo encontrado = buscarPorNombre(nombreCentro);

        if (encontrado != null) {
            encontrado.setProduccion(nuevaProduccion);
            return true;
        }
        return false;
    }


    // ============================================================
    // FILTROS AVANZADOS
    // ============================================================

    /**
     * Filtra centros cuya producción sea mayor o igual a X.
     */
    public List<CentroCultivo> filtrarProduccionMinima(int minimo) {
        return centros.stream()
                .filter(c -> c.getProduccion() >= minimo)
                .collect(Collectors.toList());
    }

    /**
     * Filtra centros cuya producción sea menor o igual a X.
     */
    public List<CentroCultivo> filtrarProduccionMaxima(int maximo) {
        return centros.stream()
                .filter(c -> c.getProduccion() <= maximo)
                .collect(Collectors.toList());
    }

    /**
     * Filtra centros dentro de un rango (min - max).
     */
    public List<CentroCultivo> filtrarRango(int minimo, int maximo) {
        return centros.stream()
                .filter(c -> c.getProduccion() >= minimo && c.getProduccion() <= maximo)
                .collect(Collectors.toList());
    }

    /**
     * Ordena por producción ascendente o descendente.
     */
    public List<CentroCultivo> ordenarPorProduccion(boolean ascendente) {

        return centros.stream()
                .sorted(ascendente ?
                        Comparator.comparingInt(CentroCultivo::getProduccion)
                        :
                        Comparator.comparingInt(CentroCultivo::getProduccion).reversed()
                )
                .collect(Collectors.toList());
    }


    // ============================================================
    // ESTADISTICAS E INFORMES
    // ============================================================

    /**
     * Retorna la cantidad total de centros registrados.
     */
    public int totalCentros() {
        return centros.size();
    }

    /**
     * Retorna la producción total de todos los centros.
     */
    public int produccionTotal() {
        return centros.stream()
                .mapToInt(CentroCultivo::getProduccion)
                .sum();
    }

    /**
     * Retorna la producción promedio.
     */
    public double produccionPromedio() {
        if (centros.isEmpty()) return 0;
        return (double) produccionTotal() / centros.size();
    }

    /**
     * Determina cuál región tiene mayor cantidad de centros.
     */
    public String regionConMasCentros() {

        if (centros.isEmpty()) return "Sin datos";

        return centros.stream()
                .collect(Collectors.groupingBy(
                        c -> c.getDireccion().getRegion(),
                        Collectors.counting()))
                .entrySet().stream()
                .max(Comparator.comparingLong(e -> e.getValue()))
                .get().getKey();
    }

    /**
     * Lista todas las regiones sin repetir.
     */
    public List<String> listarRegionesUnicas() {
        return centros.stream()
                .map(c -> c.getDireccion().getRegion())
                .distinct()
                .collect(Collectors.toList());
    }
}
