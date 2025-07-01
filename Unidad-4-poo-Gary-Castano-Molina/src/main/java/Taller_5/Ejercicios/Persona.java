package Taller_5.Ejercicios;

class Persona {
    private String nombre;  // Solo accesible dentro de esta clase
    int edad;               // Accesible desde cualquier clase en el mismo paquete

    // Métodos públicos para acceder a 'nombre'
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nuevoNombre) {
        this.nombre = nuevoNombre;
    }
}