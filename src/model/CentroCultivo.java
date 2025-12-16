package model;

public class CentroCultivo extends UnidadOperativa {
    private double toneladasProduccion;

    public CentroCultivo(String nombre, String comuna, double toneladasProduccion) {
        super(nombre, comuna);
        this.toneladasProduccion = toneladasProduccion;
    }

    @Override
    public void mostrarResumen() {
        System.out.println("[Centro de Cultivo] " + getNombre() + " - " + getComuna());
        System.out.println("Producción: " + toneladasProduccion + " toneladas\n");
    }
}
