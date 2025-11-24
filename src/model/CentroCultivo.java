package model;

/**
 * Clase principal del dominio.
 * Representa un Centro de Cultivo perteneciente a la empresa Salmontt.
 *
 * Está compuesta por:
 * - Direccion
 * - Encargado
 */
public class CentroCultivo {

    private String nombre;
    private String ciudad;
    private int produccion;
    private Direccion direccion;   // Composición
    private Encargado encargado;   // Composición

    /**
     * Constructor principal con composición incluida.
     */
    public CentroCultivo(String nombre, String ciudad, int produccion,
                         Direccion direccion, Encargado encargado) {

        this.nombre = nombre;
        this.ciudad = ciudad;
        this.produccion = produccion;
        this.direccion = direccion;
        this.encargado = encargado;
    }

    // ---------------- GETTERS & SETTERS ----------------

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getProduccion() {
        return produccion;
    }

    public void setProduccion(int produccion) {
        this.produccion = produccion;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public Encargado getEncargado() {
        return encargado;
    }

    public void setEncargado(Encargado encargado) {
        this.encargado = encargado;
    }

    // ---------------- TO STRING ----------------

    @Override
    public String toString() {
        return "\n=== Centro de Cultivo ===" +
                "\nNombre: " + nombre +
                "\nCiudad: " + ciudad +
                "\nProducción: " + produccion +
                "\nDirección: " + direccion +
                "\nEncargado: " + encargado;
    }
}

