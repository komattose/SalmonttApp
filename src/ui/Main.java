package ui;

import data.GestorUnidades;
import model.UnidadOperativa;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Unidades Operativas de Salmontt ===\n");

        List<UnidadOperativa> unidades = GestorUnidades.crearListaUnidades();

        GestorUnidades.mostrarUnidades(unidades);

        System.out.println("=== Fin de la demostración ===");
    }
}

