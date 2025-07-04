package Taller_11.Ejercicios;


public class Main {
    public static void main(String[] args) {
        Figura f1 = new Circulo(5);       // Radio 5
        Figura f2 = new Rectangulo(4, 6); // Ancho 4, Alto 6

        f1.mostrarArea(); // Muestra el área del círculo
        f2.mostrarArea(); // Muestra el área del rectángulo
    }
}