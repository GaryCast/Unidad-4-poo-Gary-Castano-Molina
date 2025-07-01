package Taller_5.Ejercicios;

// No se usa public, por lo tanto la clase tiene acceso de paquete
class Producto {
    // Atributos con acceso de paquete (default)
    String nombre;
    double precio;
    int stock;

    // Constructor con acceso de paquete
    Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    // Metodo con acceso de paquete
    void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Stock: " + stock + " unidades");
    }
}
