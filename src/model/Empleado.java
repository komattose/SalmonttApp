package model;

/**
 * Representa un empleado de la empresa Salmontt.
 * Hereda de Persona e incluye cargo y salario.
 */
public class Empleado extends Persona {
    private String cargo;
    private double salario;

    public Empleado(String nombre, Rut rut, Direccion direccion, String cargo, double salario) {
        super(nombre, rut, direccion);
        this.cargo = cargo;
        this.salario = salario;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("[Empleado] " + nombre + " - Cargo: " + cargo + " - Salario: $" + salario);
    }
}
