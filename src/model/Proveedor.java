package model;

public class Proveedor implements Registrable {
    private String nombreEmpresa;
    private String tipoInsumo;

    public Proveedor(String nombreEmpresa, String tipoInsumo) {
        this.nombreEmpresa = nombreEmpresa;
        this.tipoInsumo = tipoInsumo;
    }

    @Override
    public void mostrarResumen() {
        System.out.println("[Proveedor] " + nombreEmpresa + " - Insumo: " + tipoInsumo + "\n");
    }

    @Override
    public String toString() {
        return "Proveedor {nombre='" + nombreEmpresa + "', tipoInsumo='" + tipoInsumo + "'}";
    }
}
