package model;

import utils.ValidadorRut;

/**
 * Clase que encapsula la lógica del RUT chileno.
 * Valida el formato y el dígito verificador al momento de la creación.
 */
public class Rut {
    private String numero;

    public Rut(String numero) {
        if (!ValidadorRut.validar(numero)) {
            throw new IllegalArgumentException("RUT inválido: " + numero);
        }
        this.numero = numero;
    }

    @Override
    public String toString() {
        return numero;
    }
}
