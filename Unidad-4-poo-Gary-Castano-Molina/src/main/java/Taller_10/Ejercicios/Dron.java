package Taller_10.Ejercicios;


class Dron extends Mensajero {
    // la firma es diferente (int en lugar de String)
    public void entregarPaquete(int codigoPostal) {
        System.out.println("Volando al código postal " + codigoPostal);
    }
}
//el error es que la firma de entregarPaquete es diferente
