package Taller_7.Ejercicios;

public class Main {
    public static void main(String[] args) {
        Empleado e1 = new Empleado();

        // Acceso directo permitido a nombre (es público)
        e1.nombre = "Santiago";

        // Acceso controlado al salario
        e1.setSalario(3200.50);
        System.out.println("Empleado: " + e1.nombre);
        System.out.println("Salario: $" + e1.getSalario());

        // Intento de asignar salario negativo
        e1.setSalario(-1000); // Validación evita el cambio
    }
}
