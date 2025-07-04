package Taller_11.Ejercicios;

//Clase abstracta Empleado
abstract class Empleado {
    protected String nombre;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    // Metodo abstracto que las subclases deben implementar
    public abstract double calcularSalario();

    // Metodo concreto que muestra los detalles del empleado
    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: $" + calcularSalario());
    }
}
