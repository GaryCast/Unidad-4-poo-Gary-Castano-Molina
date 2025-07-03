package Taller_8.Ejercicios;

public class Coche extends Vehiculo {
    private int numeroDePuertas;

    public Coche(String marca, int velocidadMaxima, int numeroDePuertas) {
        super(marca, velocidadMaxima);
        this.numeroDePuertas = numeroDePuertas;
    }

    public void mostrarInformacionCoche() {
        mostrarInformacionVehiculo(); // Accede al metodo heredado
        System.out.println("Número de Puertas: " + numeroDePuertas);
    }
}