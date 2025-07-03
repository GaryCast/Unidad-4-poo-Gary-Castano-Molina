package Taller_10.Ejercicios;


public class Main {
    public static void main(String[] args) {
        Vehiculo v1 = new Vehiculo();
        Vehiculo v2 = new Bicicleta(); // Usamos polimorfismo: tipo Vehiculo, instancia Bicicleta

        // Llamada al metodo moverse
        v1.moverse(); // Salida: El vehículo se está moviendo.
        v2.moverse(); // Salida: La bicicleta avanza pedaleando.
    }
}