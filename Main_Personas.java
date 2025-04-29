package Practica01;

import java.util.Scanner;

public class Main_Personas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //objeto 01(Sin parametros)
        Personas persona01= new Personas("Kevin Simbaña", "Quito", 20);

        //llamar al metodo
        persona01.Saludo();
    }
}