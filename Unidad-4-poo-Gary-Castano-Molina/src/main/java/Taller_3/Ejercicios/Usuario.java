package Taller_3.Ejercicios;

public class Usuario {
    private String nombre;

    public static void establecerNombre(String nuevoNombre) {
        nombre = nuevoNombre;
    }
}
/**Error: no se puede acceder a 'nombre' directamente
 El metodo establecerNombre es static, lo que significa que pertenece a la clase, no a una instancia específica.
 El atributo nombre es no estático, por lo tanto solo existe cuando hay un objeto creado.
 En un contexto estático no se puede usar directamente un atributo de instancia, porque no hay un objeto concreto al cual pertenecer. Tampoco puede usarse this.
 */