package Taller_7.Ejercicios;

public class CuentaBancaria {
    private String numeroCuenta;     // Acceso privado
    private double saldo;            // Acceso privado
    public String tipoCuenta;        // Acceso público

    // Constructor para inicializar los atributos
    public CuentaBancaria(String numeroCuenta, double saldo, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
    }

    // Métodos públicos para acceder y modificar el saldo
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double nuevoSaldo) {
        if (nuevoSaldo >= 0) {
            this.saldo = nuevoSaldo;
        } else {
            System.out.println("El saldo no puede ser negativo.");
        }
    }

    // Metodo público para mostrar los detalles
    public void mostrarDetalles() {
        System.out.println("Número de Cuenta: " + numeroCuenta);
        System.out.println("Tipo de Cuenta: " + tipoCuenta);
        System.out.println("Saldo: $" + saldo);
    }
}