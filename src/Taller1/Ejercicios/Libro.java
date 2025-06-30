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
    public void mostrarInformacion() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Número de páginas: " + numeroPaginas);

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
