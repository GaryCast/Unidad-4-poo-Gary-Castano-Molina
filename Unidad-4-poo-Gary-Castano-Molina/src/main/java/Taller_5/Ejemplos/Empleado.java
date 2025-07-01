package Taller_5.Ejemplos;

class Empleado {
    String nombre;
    double salario;
    Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }
    void mostrarInformacion() {
        System.out.println("Nombre: " + nombre + ", Salario: " + salario);
    }
}