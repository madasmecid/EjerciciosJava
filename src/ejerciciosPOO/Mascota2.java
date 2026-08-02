package ejerciciosPOO;

public class Mascota2 {

    //Mascota con constructor

    String nombre;
    int energia;

    public Mascota2(String n, int e) {

        nombre = n;
        energia = e;
    }

    public void mostrarDatos() {
        System.out.println("\nNombre: " + nombre);
        System.out.println("Energia: " + energia);
    }

    public static void main (String[] args) {

        Mascota2 mascota1 = new Mascota2("firu", 100);

        mascota1.mostrarDatos();


        Mascota2 mascota2 = new Mascota2("terry", 80);

        mascota2.mostrarDatos();
    }

}
