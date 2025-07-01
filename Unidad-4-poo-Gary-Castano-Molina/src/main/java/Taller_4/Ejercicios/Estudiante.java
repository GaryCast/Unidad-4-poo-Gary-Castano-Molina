package Taller_4.Ejercicios;

public class Estudiante {
    // Atributos privados
    private String nombre;
    private int edad;
    private double notaPromedio;

    // Getter y Setter para nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        } else {
            System.out.println(" Nombre inválido");
        }
    }

    // Getter y Setter para edad
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad >= 0 && edad <= 120) {
            this.edad = edad;
        } else {
            System.out.println("Edad fuera de rango");
        }
    }

    // Getter y Setter para notaPromedio
    public double getNotaPromedio() {
        return notaPromedio;
    }

    public void setNotaPromedio(double notaPromedio) {
        if (notaPromedio >= 0.0 && notaPromedio <= 5.0) {
            this.notaPromedio = notaPromedio;
        } else {
            System.out.println("Nota promedio inválida (debe estar entre 0.0 y 5.0)");
        }
    }

    // Metodo para mostrar detalles
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Nota Promedio: " + notaPromedio);
    }
}