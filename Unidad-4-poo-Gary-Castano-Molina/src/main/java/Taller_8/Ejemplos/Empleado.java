package Taller_8.Ejemplos;

// Clase base
public class Empleado {
    protected String nombre;
    protected double salario;
    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }
    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre + ", Salario: " + salario);
    }
}
