package Taller_14.Ejercicios;

public class Main {
    public static void main(String[] args) {
        Animal miAnimal = new Perro();  // ← polimorfismo
        miAnimal.hacerSonido();

        miAnimal.moverCola();  // Error de compilación: metodo no existe en Animal
    }
}