package Taller_7.Ejercicios;

public class Empleado {
    public String nombre;          // Propiedad pública

    private double salario;        // Propiedad privada para proteger acceso directo

    // Metodo getter público para salario
    public double getSalario() {
        return salario;
    }

    // Metodo setter público para salario con validación
    public void setSalario(double salario) {
        if (salario >= 0) {
            this.salario = salario;
        } else {
            System.out.println("Salario inválido. Debe ser un valor positivo.");
        }
    }
}
