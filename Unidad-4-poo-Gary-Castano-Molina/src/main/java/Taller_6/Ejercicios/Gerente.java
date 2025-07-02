package Taller_6.Ejercicios;

public class Gerente extends Empleado {
    private String departamento;

    public Gerente(String nombre, double salario, String departamento) {
        super(nombre, salario); // llama al constructor de Empleado
        this.departamento = departamento;
    }

    // Sobrescribe mostrarInformacion para incluir departamento
    @Override
    public void mostrarInformacion() {
        // Puede acceder directamente a nombre y salario porque son protected
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: $" + salario);
        System.out.println("Departamento: " + departamento);
    }
}