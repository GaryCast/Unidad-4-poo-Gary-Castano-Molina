package Taller1.Ejercicios;

public class Libro {
    String titulo;
    String autor;
    int numeroPaginas;

    // Constructor por defecto
    public Libro() {
        this.titulo = "poo";
        this.autor = "John Arrieta";
        this.numeroPaginas = 999;
    }

    // Constructor con parámetros
    public Libro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = paginas;
    }

    // Metodo para mostrar información del libro
    public String toString() {
        return "Libro \n" + " titulo: " + titulo + "\n autor: " + autor + "\n numeroPaginas: " + numeroPaginas;
    }

    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }
    public int getNumeroPaginas() {
        return numeroPaginas;
    }
}
