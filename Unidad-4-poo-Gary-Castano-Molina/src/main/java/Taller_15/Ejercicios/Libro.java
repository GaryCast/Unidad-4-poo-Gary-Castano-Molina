package Taller_15.Ejercicios;

public class Libro {
    private String titulo;
    private String autor;
    private String contenido;

    public Libro(String titulo, String autor, String contenido) {
        this.titulo = titulo;
        this.autor = autor;
        this.contenido = contenido;
    }

    public String getResumen() {
        return contenido.substring(0, Math.min(contenido.length(), 100)) + "...";
    }

    // Getters
    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public String getContenido() { return contenido; }
}
