package Taller_15.Ejercicios;

public class EtiquetaService {
    private PrecioService precioService = new PrecioService();

    public String generarEtiqueta(Producto producto) {
        double precio = precioService.calcularPrecioFinal(producto);
        return "Producto: " + producto.getNombre() + " | Precio final: $" + precio;
    }
}
