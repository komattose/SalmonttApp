package model;

public class CentroCultivo extends UnidadOperativa {
    private double toneladasProduccion;

    public CentroCultivo(String nombre, String comuna, double toneladasProduccion) {
        super(nombre, comuna);
        this.toneladasProduccion = toneladasProduccion;
    }

    public double getToneladasProduccion() {
        return toneladasProduccion;
    }

    public void setToneladasProduccion(double toneladasProduccion) {
        this.toneladasProduccion = toneladasProduccion;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("[Centro de Cultivo] " + getNombre() + " - " + getComuna());
        System.out.println("Producción: " + toneladasProduccion + " toneladas\n");
    }

    @Override
    public String toString() {
        return "Centro de Cultivo {" +
                "nombre='" + getNombre() + '\'' +
                ", comuna='" + getComuna() + '\'' +
                ", toneladasProduccion=" + toneladasProduccion +
                '}';
    }
}

