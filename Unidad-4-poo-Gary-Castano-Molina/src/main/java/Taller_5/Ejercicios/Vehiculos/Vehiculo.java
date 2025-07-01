package Taller_5.Ejercicios.Vehiculos;

class Vehiculo {
    String tipo; // propiedad con acceso de paquete (default)

    Vehiculo(String tipo) {
        this.tipo = tipo;
    }

    void mostrarTipo() {
        System.out.println("Tipo de vehículo: " + tipo);
    }
}