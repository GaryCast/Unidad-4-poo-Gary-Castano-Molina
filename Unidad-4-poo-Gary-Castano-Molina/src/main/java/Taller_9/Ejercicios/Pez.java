package Taller_9.Ejercicios;

class Pez extends Animal {
    String tipoDeAgua;

    // Constructor que utiliza super para invocar el constructor de Animal
    public Pez(String especie, String tipoDeAgua) {
        super(especie); // Llama al constructor de la clase base (Animal)
        this.tipoDeAgua = tipoDeAgua;
    }

    // Metodo que invoca el metodo de la clase base y muestra tipoDeAgua
    public void mostrarDetalles() {
        super.mostrarEspecie(); // Llama al metodo mostrarEspecie de Animal
        System.out.println("Tipo de Agua: " + tipoDeAgua);
    }
}


