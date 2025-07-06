package Taller_14.Ejercicios;

public class Main {
    public static void main(String[] args) {
        Vehiculo miCoche = new Coche();         // Referencia base, objeto derivado
        Vehiculo miBici = new Bicicleta();      // Referencia base, objeto derivado

        miCoche.mover();     // Polimorfismo en acción
        miBici.mover();      // Polimorfismo en acción
    }
}