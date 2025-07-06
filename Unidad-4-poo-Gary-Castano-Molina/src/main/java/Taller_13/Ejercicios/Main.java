package Taller_13.Ejercicios;

public class Main {
    public static void main(String[] args) {
        Figura rectangulo = new Rectangulo(5.0, 3.0);
        Figura triangulo = new Triangulo(4.0, 6.0);

        System.out.println("Área del rectángulo: " + rectangulo.calcularArea());
        System.out.println("Área del triángulo: " + triangulo.calcularArea());
    }
}