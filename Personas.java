package Practica01;

public class Personas {
    String nombre;
    String ciudad;
    int edad;

    // Constructor
    public Personas(String nombre, String ciudad , int edad){
        this.nombre= nombre;
        this.ciudad = ciudad;
        this.edad = edad;
    }

    //Metodo Saludar
    public void Saludo(){
        System.out.println("Mi nombre es " + nombre + ", tengo la edad de " +edad+ " años y soy de la ciudad de " + ciudad+ " \n");
        System.out.println("Mucho Gusto");
    }
}
