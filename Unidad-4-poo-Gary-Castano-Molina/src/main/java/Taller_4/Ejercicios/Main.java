package Taller_4.Ejercicios;

public class Main {
    public static void main(String[] args) {
        Coche miCoche = new Coche("Ford", "Mustang", 240);

        // Intentar acceder directamente a los atributos privados
        // miCoche.marca = "Toyota";         // Error de compilación
        // System.out.println(miCoche.modelo); // Error de compilación
        // miCoche.velocidadMaxima = 300;     // Error de compilación

        // Acceso válido mediante métodos
        miCoche.acelerar(20);
        miCoche.acelerar(-10); // Intento inválido
        miCoche.mostrarDetalles();
    }
}