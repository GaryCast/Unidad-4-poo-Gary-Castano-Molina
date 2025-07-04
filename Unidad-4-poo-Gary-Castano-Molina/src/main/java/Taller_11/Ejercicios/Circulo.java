package Taller_11.Ejercicios;


// Clase derivada Circulo con su propia implementación de calcularArea
class Circulo extends Figura {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}
