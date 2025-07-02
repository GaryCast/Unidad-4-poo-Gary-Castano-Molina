package Taller_6.Ejercicios;

public class Banco {
    protected double saldo;

    public Banco(double saldoInicial) {
        this.saldo = saldoInicial;
    }
}
/**
 * Al declarar saldo como protected, cualquier subclase —incluso fuera del paquete— puede acceder directamente al valor del saldo y modificarlo sin control.
 * Esto rompe el encapsulamiento y permite que operaciones delicadas puedan realizarse sin validación.
 * No hay forma de garantizar que las modificaciones mantengan la integridad del dato.
 */