package Taller_15.Ejemplos;

// Clase CalculoTotalService (responsable del cálculo del total)
public class CalculoTotalService {
    public double calcularImpuestos(Pedido pedido) {
        return pedido.getTotal() * 0.15;
    }
}
