package model;

public abstract class UnidadOperativa {
    private String nombre;
    private String comuna;

    public UnidadOperativa(String nombre, String comuna) {
        this.nombre = nombre;
        this.comuna = comuna;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    // Método abstracto: se implementará de forma distinta en las subclases
    public abstract void mostrarInformacion();

    @Override
    public String toString() {
        return "Unidad Operativa {" +
                "nombre='" + nombre + '\'' +
                ", comuna='" + comuna + '\'' +
                '}';
    }
}

