package Taller_4.Ejercicios;

public class Main {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante();

        // Asignación con validaciones
        estudiante1.setNombre("Valentina");
        estudiante1.setEdad(20);
        estudiante1.setNotaPromedio(4.6);

        // Mostrar datos
        estudiante1.mostrarDatos();

        // Intento de asignación incorrecta
        Estudiante estudiante2 = new Estudiante();
        estudiante2.setNombre(""); // Error
        estudiante2.setEdad(-5);   // Error
        estudiante2.setNotaPromedio(6.0); // Error
    }
}