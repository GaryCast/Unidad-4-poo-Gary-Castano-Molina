package Taller_6.Ejercicios;

public class Taller {
    public void revisarVehiculo() {
        Vehiculo vehiculo = new Vehiculo("Camioneta", "Chevrolet");

        // Intento de acceso directo a miembros protected desde clase no relacionada
        System.out.println(vehiculo.tipo);   // Error de compilación
        System.out.println(vehiculo.marca); // Error de compilación
    }
}