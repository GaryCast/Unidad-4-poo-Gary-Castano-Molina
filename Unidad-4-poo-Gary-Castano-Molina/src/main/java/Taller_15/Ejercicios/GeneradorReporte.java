package Taller_15.Ejercicios;

public class GeneradorReporte {
    public String generarPDF(Libro libro) {
        return "PDF generado: " + libro.getTitulo();
    }
}