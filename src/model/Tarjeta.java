package model;

/**
 * Clase que representa una tarjeta de cliente (por ejemplo, Visa o Mastercard).
 */
public class Tarjeta {
    private String tipo;
    private String numero;

    public Tarjeta(String tipo, String numero) {
        this.tipo = tipo;
        this.numero = numero;
    }

    @Override
    public String toString() {
        return tipo + " (" + numero + ")";
    }
}
