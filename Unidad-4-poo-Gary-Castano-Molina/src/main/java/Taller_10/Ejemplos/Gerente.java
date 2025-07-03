package Taller_10.Ejemplos;

// Clase derivada
public class Gerente extends Empleado {
    @Override
    public void trabajar() {
        System.out.println("El gerente está gestionando el equipo.");
    }
}

 //La clase Gerente sobrescribe el metodo trabajar para proporcionar un comportamiento más específico
