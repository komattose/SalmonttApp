package model;

/**
 * Representa a un proveedor de productos.txt o servicios.
 */
public class Proveedor extends Persona {
    private String empresa;

    public Proveedor(String nombre, Rut rut, Direccion direccion, String empresa) {
        super(nombre, rut, direccion);
        this.empresa = empresa;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("[Proveedor] " + nombre + " - Empresa: " + empresa);
    }
}
