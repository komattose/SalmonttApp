package data;

import model.*;
import java.util.ArrayList;
import java.util.List;

public class GestorEntidades {

    private List<Registrable> registros;

    public GestorEntidades() {
        registros = new ArrayList<>();
    }

    public void cargarEntidades() {
        registros.add(new CentroCultivo("Centro Chinquihue", "Puerto Montt", 850.5));
        registros.add(new PlantaProceso("Planta Sur", "Puerto Varas", 120));
        registros.add(new Proveedor("AquaFeed Ltda", "Alimentos Balanceados"));
        registros.add(new Empleado("María González", "Supervisora de Planta"));
        registros.add(new Empleado("Carlos Muñoz", "Gerente de Producción"));
    }

    public void mostrarEntidades() {
        for (Registrable r : registros) {
            r.mostrarResumen();

            // Ejemplo de diferenciación mediante instanceof
            if (r instanceof Proveedor) {
                System.out.println("→ Este registro corresponde a un proveedor externo.\n");
            } else if (r instanceof Empleado) {
                System.out.println("→ Este registro corresponde a un colaborador interno.\n");
            }
        }
    }

    public List<Registrable> getRegistros() {
        return registros;
    }
}
