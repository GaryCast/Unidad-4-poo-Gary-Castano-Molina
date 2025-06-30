package Taller_2.Ejercicios;

public class Persona {
    private String nombre;

    // Constructor para asignar nombre
    public Persona(String nombre) {
        this.nombre = nombre;
    }

    // Metodo de instancia No estático
    public void mostrarNombre() {
        System.out.println(this.nombre);
    }
}
