package model;

/**
 * Clase simple que representa una dirección postal.
 * Se utiliza mediante composición dentro de Persona.
 */
public class Direccion {
    private String calle;
    private String ciudad;
    private String region;

    public Direccion(String calle, String ciudad, String region) {
        this.calle = calle;
        this.ciudad = ciudad;
        this.region = region;
    }

    @Override
    public String toString() {
        return calle + ", " + ciudad + ", " + region;
    }
}
