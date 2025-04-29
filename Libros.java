package Practica04;

public class Libros {
    // Atributos
    String titulo;
    String autor;
    int paginas;

    // Constructor sin parámetros (valores por defecto)
    public Libros() {
        titulo = "Desconocido";
        autor = "Desconocido";
        paginas = 0;
    }

    // Constructor con parámetros
    public Libros(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    //Metodo para imprimir la informacion
    public void imprimirInfo() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Páginas: " + paginas);
        System.out.println("-------------------------");
    }
}
