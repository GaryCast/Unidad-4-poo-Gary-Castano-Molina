package Taller_9.Ejercicios;


class Empleado extends Persona {
    String departamento;

    public Empleado(String nombre, int edad, String departamento) {
        super(nombre, edad); // Llama al constructor de la clase padre (Persona)
        this.departamento = departamento;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles(); // Llama al metodo mostrarDetalles de Persona
        System.out.println("Departamento: " + departamento);
    }
}

