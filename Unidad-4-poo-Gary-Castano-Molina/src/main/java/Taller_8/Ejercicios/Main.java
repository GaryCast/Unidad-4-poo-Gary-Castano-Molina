package Taller_8.Ejercicios;

public class Main {
    public static void main(String[] args) {
        Empleado e1 = new Empleado("Luis", 2800.00);
        Gerente g1 = new Gerente("Verónica", 4500.00, "Recursos Humanos");

        System.out.println("🧑‍🔧 Empleado:");
        e1.mostrarDetalles();

        System.out.println("\n👩‍💼 Gerente:");
        g1.mostrarDetalles();
    }
}
