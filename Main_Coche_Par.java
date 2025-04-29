package Practica02;

import java.util.Scanner;
public class Main_Coche_Par {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Atributo con scanner
        System.out.print("Ingrese el modelo del Practica02.Coche:");
        String modelo = scanner.nextLine();
        System.out.print("Ingrese La placa del Practica02.Coche:");
        String placa = scanner.nextLine();
        System.out.print("Ingrese el color del Practica02.Coche:");
        String color = scanner.nextLine();

        //objeto 01
        Coche_Par coche01=new Coche_Par(modelo,placa,color);
        //Visualizacion
        coche01.datos_coche_Par();
    }
}
