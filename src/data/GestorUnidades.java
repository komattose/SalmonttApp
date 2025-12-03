package data;

import model.CentroCultivo;
import model.PlantaProceso;
import model.UnidadOperativa;
import java.util.ArrayList;
import java.util.List;

public class GestorUnidades {

    // Retorna una lista polimórfica con objetos de distintas subclases
    public static List<UnidadOperativa> crearListaUnidades() {
        List<UnidadOperativa> unidades = new ArrayList<>();

        unidades.add(new CentroCultivo("Centro Chinquihue", "Puerto Montt", 850.5));
        unidades.add(new CentroCultivo("Centro Quellón Norte", "Quellón", 920.7));
        unidades.add(new PlantaProceso("Planta Sur", "Puerto Varas", 120));
        unidades.add(new PlantaProceso("Planta Norte", "Calbuco", 150));
        unidades.add(new PlantaProceso("Planta Industrial Patagonia", "Puerto Montt", 200));

        return unidades;
    }

    // Recorre la lista aplicando polimorfismo
    public static void mostrarUnidades(List<UnidadOperativa> unidades) {
        for (UnidadOperativa u : unidades) {
            u.mostrarInformacion(); // Llama al método correcto según el tipo real del objeto
        }
    }
}

