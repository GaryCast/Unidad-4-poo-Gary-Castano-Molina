package Taller_5.Ejercicios.Vehiculos;

class Moto extends Vehiculo {
    Moto(String tipo) {
        super(tipo);
    }

    void mostrarDetalles() {
        System.out.println("Detalles de la moto:");
        mostrarTipo(); // permitido porque está en el mismo paquete
    }
}
