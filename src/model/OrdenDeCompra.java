package model;

import java.util.List;

/**
 * Representa una orden de compra dentro del sistema.
 * Contiene una lista de productos.txt asociados a un cliente.
 */
public class OrdenDeCompra implements Registrable {
    private String codigo;
    private Cliente cliente;
    private List<Producto> productos;

    public OrdenDeCompra(String codigo, Cliente cliente, List<Producto> productos) {
        this.codigo = codigo;
        this.cliente = cliente;
        this.productos = productos;
    }

    @Override
    public void registrar() {
        System.out.println("Orden " + codigo + " registrada para " + cliente.getNombre());
    }

    @Override
    public void mostrarDatos() {
        System.out.println("[OrdenDeCompra] Código: " + codigo + " | Cliente: " + cliente.getNombre());
        for (Producto p : productos) {
            System.out.println("  - " + p);
        }
    }
}
