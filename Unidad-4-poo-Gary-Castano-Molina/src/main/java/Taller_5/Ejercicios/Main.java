package Taller_5.Ejercicios;

public class Main {
    public static void main(String[] args) {
        Persona p = new Persona();

        // Acceso a atributo 'edad' (default) → VÁLIDO
        p.edad = 25;

        // Acceso a atributo 'nombre' → NO válido directamente
        // p.nombre = "Carlos"; // Error de compilación

        // Acceso vía métodos públicos → VÁLIDO
        p.setNombre("Carlos");
        System.out.println("Nombre: " + p.getNombre());
        System.out.println("Edad: " + p.edad);
    }
}
/**
 * private es perfecto para proteger la integridad del objeto y evitar accesos no deseados.
 * El acceso de paquete (default) permite más flexibilidad interna, útil cuando varias clases del mismo paquete necesitan interactuar.
 */