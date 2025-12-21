package model;

/**
 * Clase abstracta que representa a una persona del sistema.
 * Implementa la interfaz Registrable y sirve como clase base para Cliente, Empleado y Proveedor.
 */
public abstract class Persona implements Registrable {
    protected String nombre;
    protected Rut rut;
    protected Direccion direccion;

    public Persona(String nombre, Rut rut, Direccion direccion) {
        this.nombre = nombre;
        this.rut = rut;
        this.direccion = direccion;
    }

    public String getNombre() { return nombre; }
    public Rut getRut() { return rut; }
    public Direccion getDireccion() { return direccion; }

    @Override
    public void registrar() {
        System.out.println(nombre + " registrado correctamente.");
    }

    @Override
    public String toString() {
        return nombre + " | " + rut + " | " + direccion;
    }
}
