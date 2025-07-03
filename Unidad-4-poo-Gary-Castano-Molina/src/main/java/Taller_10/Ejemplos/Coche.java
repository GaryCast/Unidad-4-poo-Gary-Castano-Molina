package Taller_10.Ejemplos;

// Clase derivada (incorrecta)
public class Coche extends Vehiculo {
    // Error de compilación: Diferente firma del metodo
    @Override
    public void acelerar() {
        System.out.println("El coche acelera.");
    }
}
//El metodo acelerar en Coche no tiene la misma firma que el metodo acelerar enVehiculo, lo cual genera un error de compilación.