package model;

/**
 * Interfaz común que define el contrato de registro y visualización.
 * Todas las entidades del sistema la implementan.
 */
public interface Registrable {
    void registrar();
    void mostrarDatos();
}
