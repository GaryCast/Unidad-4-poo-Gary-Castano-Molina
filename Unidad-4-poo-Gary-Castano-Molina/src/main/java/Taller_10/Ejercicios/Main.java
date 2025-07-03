package Taller_10.Ejercicios;

public class Main {
    public static void main(String[] args) {
        // Usamos la clase base como tipo de referencia
        Persona p1 = new Persona();
        Persona p2 = new Estudiante();
        Persona p3 = new Profesor();

        // Invocamos el metodo presentarse
        p1.presentarse(); // "Hola, soy una persona."
        p2.presentarse(); // "Hola, soy un estudiante..."
        p3.presentarse(); // "Hola, soy un profesor..."
    }
}
/**
 * @Override sobrescribe el comportamiento del metodo en las subclases.
 * Gracias al polimorfismo, aunque estudiantes y profesores tienen tipo Persona, ejecutan el metodo adecuado según la instancia real.
 */