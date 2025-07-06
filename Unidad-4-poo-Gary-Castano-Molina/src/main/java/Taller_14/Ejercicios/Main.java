package Taller_14.Ejercicios;

public class Main {
    public static void main(String[] args) {
        Figura figura1 = new Circulo(3.0);
        Figura figura2 = new Rectangulo(4.0, 5.0);

        figura1.calcularArea(); // Usa metodo de Circulo
        figura2.calcularArea(); // Usa metodo de Rectangulo
    }
}
