package Taller_3.Ejemplos;

public class Main {

    public static void main(String[] args) {
        Contador c1 = new Contador();
        Contador c2 = new Contador();
        Contador c3 = new Contador();
        // Se accede al metoodo estático usando el nombre de la clase
        Contador.mostrarContador(); // Muestra: Contador global: 3
    }
}
