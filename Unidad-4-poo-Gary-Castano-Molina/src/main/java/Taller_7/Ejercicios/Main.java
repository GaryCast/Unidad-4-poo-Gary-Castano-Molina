package Taller_7.Ejercicios;

public class Main {
    public static void main(String[] args) {
        // Validando funcionamiento
        int suma = Utilidades.sumar(10, 5);
        int resta = Utilidades.restar(20, 8);
        int producto = Utilidades.multiplicar(4, 6);
        double cociente = Utilidades.dividir(18, 3);

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + producto);
        System.out.println("División: " + cociente);
    }
}
