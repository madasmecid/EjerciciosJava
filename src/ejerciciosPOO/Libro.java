package ejerciciosPOO;

public class Libro {

    String titulo;
    String autor;
    int paginas;

    public Libro(String a, String b, int c) {
        titulo = a;
        autor = b;
        paginas = c;
    }

    public void mostrarDAtos() {
        System.out.println("\nTitulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Paginas: " + paginas);
    }

    public static void main (String[] args) {

        Libro libro1 = new Libro("harry", "marco", 250);

        libro1.mostrarDAtos();

        Libro libro2 = new Libro("Anillos", "tolken", 400);

        libro2.mostrarDAtos();

    }
}
