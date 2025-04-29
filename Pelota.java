package Practica03;

public class Pelota {
    // Atributos
    String color;
    String tamanio;

    // Constructor
    public Pelota(String color, String tamanio) {
        this.color = color;
        this.tamanio = tamanio;
    }

    //Metodo para mostrar detalles
    public void mostrarDetalles() {
        System.out.println("Practica03.Pelota de color " + color + " y tamaño " + tamanio);
    }
}