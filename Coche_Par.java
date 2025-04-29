package Practica02;

public class Coche_Par {
    //Asignacion de Atributos
    String modelo;
    String placa;
    String color;
    //Metodo Constructor con parametros
    public Coche_Par ( String modelo,String placa,String color){
        this.modelo= modelo;
        this.placa=placa;
        this.color=color;
    }
    //metodo visualizar datos del coche
    public void datos_coche_Par(){
        System.out.println("Datos del Carro");
        System.out.println("----------------------");
        System.out.println("El modelo del carro es: "+modelo+".");
        System.out.println("La placa que lleva el carro es: "+placa+".");
        System.out.println("El color del carro es: "+ color +".");
    }
}
