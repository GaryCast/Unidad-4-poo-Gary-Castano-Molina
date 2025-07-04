package Taller_11.Ejercicios;

//Clase abstracta Figura con metodo abstracto calcularArea
abstract class Figura {
    // Metodo abstracto que debe ser implementado por las subclases
    public abstract double calcularArea();

    // Metodo concreto que usa calcularArea para mostrar el área
    public void mostrarArea() {
        System.out.println("Área: " + calcularArea());
    }
}
