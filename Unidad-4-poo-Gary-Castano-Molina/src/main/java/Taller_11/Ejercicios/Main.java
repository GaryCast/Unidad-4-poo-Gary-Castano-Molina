package Taller_11.Ejercicios;

// Clase de prueba para mostrar los detalles con polimorfismo
public class Main {
    public static void main(String[] args) {
        Empleado e1 = new Gerente("Ana", 5000000, 1200000);
        Empleado e2 = new Vendedor("Luis", 3000000, 800000);

        e1.mostrarDetalles(); // Muestra salario con bono
        e2.mostrarDetalles(); // Muestra salario con comisión
    }
}
