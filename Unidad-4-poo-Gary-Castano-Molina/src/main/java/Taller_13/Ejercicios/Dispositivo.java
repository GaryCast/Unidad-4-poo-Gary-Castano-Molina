package Taller_13.Ejercicios;

public abstract class Dispositivo {

    public default void reiniciar() {  //el error es que no se puede sobreescribir
        System.out.println("Se esporrrondingo esto...");
    }
}