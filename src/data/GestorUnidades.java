package data;

import model.CentroCultivo;
import model.PlantaProceso;
import model.UnidadOperativa;

public class GestorUnidades {

    public static UnidadOperativa[] crearUnidades() {
        UnidadOperativa[] unidades = new UnidadOperativa[4];

        unidades[0] = new CentroCultivo("Centro Chinquihue", "Puerto Montt", 850.5);
        unidades[1] = new CentroCultivo("Centro Quellón Norte", "Quellón", 920.7);
        unidades[2] = new PlantaProceso("Planta Sur", "Puerto Varas", 120);
        unidades[3] = new PlantaProceso("Planta Norte", "Calbuco", 150);

        return unidades;
    }
}

