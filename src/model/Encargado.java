package model;

/**
 * Clase que representa al encargado de un centro de cultivo.
 * Es utilizada como parte de la composición en CentroCultivo.
 */
public class Encargado {

    private String nombre;

    /**
     * Constructor principal.
     *
     * @param nombre Nombre del encargado.
     */
    public Encargado(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
