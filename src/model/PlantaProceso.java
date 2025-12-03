package model;

public class PlantaProceso extends UnidadOperativa {
    private int capacidadProceso; // toneladas por día

    public PlantaProceso(String nombre, String comuna, int capacidadProceso) {
        super(nombre, comuna);
        this.capacidadProceso = capacidadProceso;
    }

    public int getCapacidadProceso() {
        return capacidadProceso;
    }

    public void setCapacidadProceso(int capacidadProceso) {
        this.capacidadProceso = capacidadProceso;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("[Planta de Proceso] " + getNombre() + " - " + getComuna());
        System.out.println("Capacidad: " + capacidadProceso + " toneladas/día\n");
    }

    @Override
    public String toString() {
        return "Planta de Proceso {" +
                "nombre='" + getNombre() + '\'' +
                ", comuna='" + getComuna() + '\'' +
                ", capacidadProceso=" + capacidadProceso +
                '}';
    }
}

