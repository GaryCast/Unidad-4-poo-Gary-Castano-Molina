package Taller_3.Ejercicios;

public class Coche {
    private String marca;
    private String modelo;
    private static int contadorCoches = 0; // Atributo estático

    // Constructor que incrementa el contador al crear un objeto
    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        contadorCoches++; // Se incrementa cada vez que se instancia un coche
    }

    // Metodo estático para mostrar cuántos coches se han creado
    public static void mostrarContador() {
        System.out.println("Total de coches creados: " + contadorCoches);
    }

}
