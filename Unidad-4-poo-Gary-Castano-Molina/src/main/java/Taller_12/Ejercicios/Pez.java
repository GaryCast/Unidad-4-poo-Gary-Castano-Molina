package Taller_12.Ejercicios;

public class Pez implements Nadador, Respirador {

    @Override
    public void nadar() {
        System.out.println("El pez se desliza suavemente por el agua.");
    }

    @Override
    public void respirar() {
        System.out.println("El pez respira a través de sus branquias.");
    }
}