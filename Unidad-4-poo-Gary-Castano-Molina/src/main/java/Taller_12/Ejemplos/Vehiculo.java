package Taller_12.Ejemplos;

// Interfaz Vehiculo con un metodo abstracto y un metodo predeterminado
public interface Vehiculo {
    void acelerar();
    default void encender() {
        System.out.println("El vehículo está encendido.");
    }
}
