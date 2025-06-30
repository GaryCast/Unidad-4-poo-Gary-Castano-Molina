package Taller_2.Ejemplos;

public class Persona {
    private String nombre;
    public Persona(String nombre) {
        this.nombre = nombre;// Usando this para referirse al atributo de la clase
    }
    public void mostrarNombre() {
        System.out.println("Nombre: " + this.nombre); // Usando this para referirse al atributo de la clase
    }
}
