package Taller_15.Ejercicios;

public class Main {
    public static void main(String[] args) {
        Libro miLibro = new Libro("Patrones de Diseño", "G. Gamma", "Contenido detallado...");

        GeneradorReporte generador = new GeneradorReporte();
        LibroRepositorio repositorio = new LibroRepositorio();

        System.out.println(miLibro.getResumen());
        System.out.println(generador.generarPDF(miLibro));
        repositorio.guardar(miLibro);
    }
}
