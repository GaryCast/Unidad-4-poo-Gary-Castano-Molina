package Taller_12.Ejercicios;

public class Ave implements Volador, Cantante {

    @Override
    public void volar() {
        System.out.println("El ave extiende sus alas y vuela por el cielo.");
    }

    @Override
    public void cantar() {
        System.out.println("El ave canta una melodía alegre.");
    }
}