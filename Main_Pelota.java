package Practica03;

public class Main_Pelota {
    public static void main(String[] args) {
        Pelota pelota1 = new Pelota("rojo", "mediano");
        Pelota pelota2 = new Pelota("azul", "grande");
        Pelota pelota3 = new Pelota("verde", "pequeño");

        pelota1.mostrarDetalles();
        pelota2.mostrarDetalles();
        pelota3.mostrarDetalles();
    }
}
