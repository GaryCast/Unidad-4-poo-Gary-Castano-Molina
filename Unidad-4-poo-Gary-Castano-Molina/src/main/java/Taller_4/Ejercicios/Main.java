package Taller_4.Ejercicios;

// Otra clase que intenta acceder directamente
public class Main {
    public static void main(String[] args) {
        Persona p = new Persona();
        System.out.println(p.nombre); // Error: 'nombre' tiene acceso privado
    }
}
/**
 * Explicación:
 * El atributo nombre está marcado como private, lo que significa que solo puede ser accedido dentro de la clase Persona.
 * Desde Prueba, no se puede tocar ese dato directamente. Se deben usar metodos publicos como getNombre() para acceder de forma controlada.
 */