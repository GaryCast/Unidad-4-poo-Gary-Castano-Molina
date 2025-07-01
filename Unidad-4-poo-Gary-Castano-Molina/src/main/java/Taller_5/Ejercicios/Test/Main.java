package Taller_5.Ejercicios.Test;

import vehiculos.Moto; // intento de importar Moto con acceso default

public class Main {
    public static void main(String[] args) {
        Moto miMoto = new Moto("Deportiva"); // error de compilación
        miMoto.mostrarDetalles();            // también falla
    }
}
/**
 * - Las clases Vehiculo y Moto tienen acceso de paquete (default), lo que significa que solo pueden ser usadas dentro del paquete vehiculos.
 * - Desde otro paquete (test), no puedes crear objetos ni acceder a métodos si las clases o sus miembros no son public.
 * - Además, si los métodos mostrarTipo() y mostrarDetalles() tampoco son públicos, su invocación también fallará.
 */