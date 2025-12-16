package ui;

import data.GestorEntidades;
import model.*;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        GestorEntidades gestor = new GestorEntidades();
        gestor.cargarEntidades();

        JOptionPane.showMessageDialog(null,
                "Bienvenido al sistema SalmonttApp\nGestión de Entidades",
                "SalmonttApp", JOptionPane.INFORMATION_MESSAGE);

        int opcion;
        do {
            String menu = """
                    ===== MENÚ PRINCIPAL =====
                    1. Ver entidades registradas
                    2. Agregar nuevo proveedor
                    3. Agregar nuevo empleado
                    4. Salir
                    ==========================
                    """;
            String input = JOptionPane.showInputDialog(menu);
            if (input == null) break; // salir si cancela

            opcion = Integer.parseInt(input);

            switch (opcion) {
                case 1 -> gestor.mostrarEntidades();
                case 2 -> {
                    String nombreProv = JOptionPane.showInputDialog("Ingrese nombre de la empresa proveedora:");
                    String tipoInsumo = JOptionPane.showInputDialog("Ingrese tipo de insumo:");
                    gestor.getRegistros().add(new Proveedor(nombreProv, tipoInsumo));
                    JOptionPane.showMessageDialog(null, "Proveedor agregado correctamente.");
                }
                case 3 -> {
                    String nombreEmp = JOptionPane.showInputDialog("Ingrese nombre del empleado:");
                    String cargo = JOptionPane.showInputDialog("Ingrese cargo:");
                    gestor.getRegistros().add(new Empleado(nombreEmp, cargo));
                    JOptionPane.showMessageDialog(null, "Empleado agregado correctamente.");
                }
                case 4 -> JOptionPane.showMessageDialog(null, "Saliendo del sistema...");
                default -> JOptionPane.showMessageDialog(null, "Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 4);
    }
}
