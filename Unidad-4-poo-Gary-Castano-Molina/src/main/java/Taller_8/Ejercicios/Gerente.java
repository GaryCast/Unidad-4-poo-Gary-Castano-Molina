package Taller_8.Ejercicios;

public class Gerente extends Empleado {
    private String departamento;

    public Gerente(String nombre, double salario, String departamento) {
        super(nombre, salario);
        this.departamento = departamento;
    }

    // Sobrescribimos el metodo mostrarDetalles
    @Override
    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: $" + salario);
        System.out.println("Departamento: " + departamento);
    }
}
