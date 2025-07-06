package Taller_14.Ejercicios;

public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        Persona persona2 = new Estudiante();  // Polimorfismo
        Persona persona3 = new Profesor();    // Polimorfismo

        persona1.presentarse();
        persona2.presentarse();
        persona3.presentarse();
    }
}