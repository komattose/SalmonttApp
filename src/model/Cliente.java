package model;

/**
 * Representa un cliente dentro del sistema Salmontt.
 * Contiene una tarjeta asociada.
 */
public class Cliente extends Persona {
    private Tarjeta tarjeta;

    public Cliente(String nombre, Rut rut, Direccion direccion, Tarjeta tarjeta) {
        super(nombre, rut, direccion);
        this.tarjeta = tarjeta;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("[Cliente] " + nombre + " - Tarjeta: " + tarjeta);
    }
}
