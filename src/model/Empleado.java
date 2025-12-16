package model;

public class Empleado implements Registrable {
    private String nombre;
    private String cargo;

    public Empleado(String nombre, String cargo) {
        this.nombre = nombre;
        this.cargo = cargo;
    }

    @Override
    public void mostrarResumen() {
        System.out.println("[Empleado] " + nombre + " - Cargo: " + cargo + "\n");
    }

    @Override
    public String toString() {
        return "Empleado {nombre='" + nombre + "', cargo='" + cargo + "'}";
    }
}
