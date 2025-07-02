package Taller_7.Ejercicios;

public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("ABC123", 1500.00, "Corriente");

        // Intento de acceso directo a propiedad privada
        // System.out.println(cuenta.numeroCuenta); // Error de compilación

        // Acceso válido a tipoCuenta (pública)
        System.out.println("Tipo: " + cuenta.tipoCuenta);

        // Acceso válido mediante metodo público
        cuenta.mostrarDetalles();
    }
}
