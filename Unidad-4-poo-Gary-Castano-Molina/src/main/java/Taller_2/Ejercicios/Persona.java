package Taller_2.Ejercicios;

public class Persona {
    private String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    // Metodo estático que recibe una instancia
    public static void mostrarNombre(Persona persona) {
        System.out.println(persona.nombre);
    }
}
