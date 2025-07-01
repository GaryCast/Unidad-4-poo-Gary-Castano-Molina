package Taller_3.Ejercicios;

public class Usuario {
    private String nombre;

    // Metodo de instancia que sí puede modificar 'nombre'
    public void establecerNombre(String nuevoNombre) {
        this.nombre = nuevoNombre;
    }

    public void mostrarNombre() {
        System.out.println("Nombre: " + nombre);
    }
}