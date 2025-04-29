package Practica04;

public class Main_Libros {
    public static void main(String[] args) {

        // Usando constructor sin parámetros
        Libros libro1 = new Libros();

        // Usando constructor con parámetros
        Libros libro2 = new Libros("Cien años de soledad", "Gabriel García Márquez", 417);
        Libros libro3 = new Libros("1984", "George Orwell", 328);

        // Llamando al metodo
        libro1.imprimirInfo();
        libro2.imprimirInfo();
        libro3.imprimirInfo();
    }
}
