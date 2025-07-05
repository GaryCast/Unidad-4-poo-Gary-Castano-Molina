package Taller_12.Ejemplos;

// Clase Robot que implementa ambas interfaces
public class Robot implements Caminador, Hablador {
    @Override
    public void caminar() {
        System.out.println("El robot está caminando.");
    }
    @Override
    public void hablar() {
        System.out.println("El robot está hablando.");
    }
}