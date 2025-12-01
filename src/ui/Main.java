package ui;

import data.GestorUnidades;
import model.UnidadOperativa;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Unidades Operativas de Salmontt ===\n");

        UnidadOperativa[] unidades = GestorUnidades.crearUnidades();

        for (UnidadOperativa unidad : unidades) {
            System.out.println(unidad);
        }

        System.out.println("\n=== Fin de la demostración ===");
    }
}

