package model;

/**
 * Representa un producto vendido por la empresa Salmontt.
 */
public class Producto implements Registrable {
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public void registrar() {
        System.out.println("Producto " + nombre + " registrado correctamente.");
    }

    @Override
    public void mostrarDatos() {
        System.out.println("[Producto] " + nombre + " - Precio: $" + precio);
    }

    @Override
    public String toString() {
        return nombre + " ($" + precio + ")";
    }
}
