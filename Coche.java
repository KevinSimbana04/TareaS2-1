package Practica02;

public class Coche {
    //Asignacion de Atributos
    String modelo;
    String placa;
    String color;

    //Metodo Constructor sin parametros
    public Coche (){
        modelo="Kia";
        placa="23jy5";
        color="Blanco";
    }


    //metodo visualizar datos del coche

    public void datos_coche(){
        System.out.println("Datos del Carro");
        System.out.println("----------------------");
        System.out.println("El modelo del carro es: "+modelo+".");
        System.out.println("La placa que lleva el carro es: "+placa+".");
        System.out.println("El color del carro es: "+ color +".");

    }
}
