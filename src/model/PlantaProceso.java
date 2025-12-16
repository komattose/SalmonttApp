package model;

public class PlantaProceso extends UnidadOperativa {
    private int capacidadProceso;

    public PlantaProceso(String nombre, String comuna, int capacidadProceso) {
        super(nombre, comuna);
        this.capacidadProceso = capacidadProceso;
    }

    @Override
    public void mostrarResumen() {
        System.out.println("[Planta de Proceso] " + getNombre() + " - " + getComuna());
        System.out.println("Capacidad: " + capacidadProceso + " toneladas/día\n");
    }
}
