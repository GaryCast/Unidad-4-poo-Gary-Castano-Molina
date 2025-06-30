package Taller1.Ejercicios;

public class Estudiante {
    String nombre;
    int edad;
    String curso;

    // Constructor por defecto
    public Estudiante() {
        this.nombre = "Gary Castaño Molina";
        this.edad = 42;
        this.curso = "Ingeniería de Software";
    }

    // Constructor con parámetros
    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Constructor sobrecargado
    public Estudiante(String nombre, int edad, String curso) {
        this(nombre, edad);
        this.curso = curso;
    }


    public String toString() {
        return "Estudiante \n" + " nombre: " + nombre + "\n edad: " + edad + "\n curso: " + curso ;
    }
}
