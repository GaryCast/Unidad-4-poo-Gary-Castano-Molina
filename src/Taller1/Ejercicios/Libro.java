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

}
