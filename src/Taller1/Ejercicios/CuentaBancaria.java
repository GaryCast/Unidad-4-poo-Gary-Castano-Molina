package Taller1.Ejercicios;

public class CuentaBancaria {
    String numeroCuenta;
    String tipoCuenta;
    double saldo;

    // Constructor por defecto
    public CuentaBancaria() {
        this.numeroCuenta = "987654321";
        this.tipoCuenta = "Ahorros";
        this.saldo = 1850000.0;
    }

    // Constructor con parámetros
    public CuentaBancaria(String numeroCuenta, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.tipoCuenta = tipoCuenta;
    }

    // Constructor sobrecargado
    public CuentaBancaria(String numeroCuenta, String tipoCuenta, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.tipoCuenta = tipoCuenta;
        this.saldo = saldo;
    }

}
