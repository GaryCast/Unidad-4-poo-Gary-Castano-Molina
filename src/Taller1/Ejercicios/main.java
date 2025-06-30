package Taller1.Ejercicios;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Instanciar Estudiante con datos del usuario
        System.out.println("Ingrese el nombre del estudiante:");
        String nombreEst = scanner.nextLine();
        System.out.println("Ingrese la edad del estudiante:");
        int edadEst = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer
        System.out.println("Ingrese el curso del estudiante:");
        String cursoEst = scanner.nextLine();
        Estudiante estudiante = new Estudiante(nombreEst, edadEst, cursoEst);

        // Instanciar Libro con datos por defecto
        Libro libro = new Libro();

        // Instanciar CuentaBancaria con datos del usuario
        System.out.println("Ingrese el número de cuenta:");
        String numeroCuenta = scanner.nextLine();
        System.out.println("Ingrese el tipo de cuenta:");
        String tipoCuenta = scanner.nextLine();
        System.out.println("Ingrese el saldo inicial:");
        double saldo = scanner.nextDouble();
        CuentaBancaria cuenta = new CuentaBancaria(numeroCuenta, tipoCuenta, saldo);

        // Mostrar información
        System.out.println("\nDatos del estudiante:");
        System.out.println(estudiante.toString());

        System.out.println("\nDatos del libro:");
        System.out.println(libro.toString());

        System.out.println("\nDatos de la cuenta bancaria:");
        System.out.println(cuenta.toString());

        scanner.close();
    }

}
