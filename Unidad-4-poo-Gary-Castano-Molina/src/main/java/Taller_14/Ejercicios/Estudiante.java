package Taller_14.Ejercicios;

public class Estudiante extends Persona {
    @Override
    public void presentarse() {
        System.out.println("Hola, soy una persona.");  // Mismo mensaje que la clase base
    }
}
/**
 * Aumenta el mantenimiento innecesario.
 * Puede confundir a otros desarrolladores, que esperan una razón lógica para la sobrescritura.
 */