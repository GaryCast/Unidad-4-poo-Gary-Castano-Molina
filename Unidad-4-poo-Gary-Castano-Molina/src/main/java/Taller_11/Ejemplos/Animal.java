package Taller_11.Ejemplos;

// Definición de una clase abstracta
public abstract class Animal {
    protected String nombre;
    // Constructor
    public Animal(String nombre) {
        this.nombre = nombre;
    }
    // Metodo abstracto (sin cuerpo)
    public abstract void hacerSonido();
    // Metodo concreto
    public void mostrarNombre() {
        System.out.println("Nombre: " + nombre);
    }
}
