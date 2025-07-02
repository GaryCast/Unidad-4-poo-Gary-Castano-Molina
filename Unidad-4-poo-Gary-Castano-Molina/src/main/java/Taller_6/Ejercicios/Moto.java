package Taller_6.Ejercicios;

public class Moto extends Vehiculo {
    private int cilindrada;

    public Moto(String tipo, String marca, int cilindrada) {
        super(tipo, marca);
        this.cilindrada = cilindrada;
    }

    public void mostrarDetalles() {
        System.out.println("Tipo: " + tipo);         // Acceso permitido (hereda de Vehiculo)
        System.out.println("Marca: " + marca);       // Acceso permitido
        System.out.println("Cilindrada: " + cilindrada + " cc");
    }
}