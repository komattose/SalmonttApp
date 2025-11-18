package model;

/**
 * Clase que representa un centro de cultivo.
 * Contiene el nombre, ubicación y producción anual.
 */
public class CentroCultivo {

    // Atributos que describen el centro
    private String nombre;
    private String ubicacion;
    private int produccion;

    /**
     * Constructor que recibe todos los datos del centro.
     *
     * @param nombre     nombre del centro
     * @param ubicacion  ubicación del centro
     * @param produccion producción en toneladas
     */
    public CentroCultivo(String nombre, String ubicacion, int produccion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.produccion = produccion;
    }

    // Métodos getter y setter para acceder y modificar los datos

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getProduccion() {
        return produccion;
    }

    public void setProduccion(int produccion) {
        this.produccion = produccion;
    }

    /**
     * Método toString para mostrar el contenido del objeto de forma legible.
     */
    @Override
    public String toString() {
        return "CentroCultivo{" +
                "nombre='" + nombre + '\'' +
                ", ubicacion='" + ubicacion + '\'' +
                ", produccion=" + produccion +
                '}';
    }
}

