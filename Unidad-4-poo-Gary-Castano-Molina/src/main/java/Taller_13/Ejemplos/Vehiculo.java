package Taller_13.Ejemplos;

// Definición de una interfaz
public interface Vehiculo {
    void acelerar();
    default void encender() {
        System.out.println("El vehículo está encendido.");
    }
}
