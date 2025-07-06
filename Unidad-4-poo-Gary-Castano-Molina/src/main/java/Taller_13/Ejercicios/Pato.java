package Taller_13.Ejercicios;

public class Pato implements Volador, Nadador {

    @Override
    public void volar() {
        System.out.println("El pato vuela con sus fuertes alas.");
    }

    @Override
    public void nadar() {
        System.out.println("El pato nada tranquilamente en el lago.");
    }

    public void graznar() {
        System.out.println("El pato hace cuac cuac.");
    }
}