package Taller_15.Ejercicios;

public class LibroRepositorio {
    public void guardar(Libro libro) {
        System.out.println("Guardando '" + libro.getTitulo() + "' en disco...");
        // Aquí iría la lógica real de persistencia (file, base de datos, etc.)
    }
}