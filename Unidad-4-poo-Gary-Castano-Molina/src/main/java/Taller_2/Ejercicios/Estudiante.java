package Taller_2.Ejercicios;

public class Estudiante {
    // Atributos privados
    private String nombre;
    private int edad;

    // Constructor con parámetros
    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Constructor por defecto que llama al constructor con parámetros
    public Estudiante() {
        this("Desconocido", 0); // Usa this() para invocar otro constructor
    }

    // Método para mostrar los detalles del estudiante
    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
    }
}
