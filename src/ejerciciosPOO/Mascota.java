package ejerciciosPOO;

public class Mascota {
    //Ejercicio de poo mascotas por clase y metodos

    String nombre;
    int energia;

    public void mostrarDatos() {
        System.out.println("NOmbre: " +nombre);
        System.out.println("Energia: " + energia);
    }

    public void jugar(int cantidad) {
        System.out.println("Jugaste!");
        energia = energia - (2* cantidad);
    }

    public void dormir(int cantidad) {
        System.out.println("Dormiste");

        energia = energia + (5* cantidad);
    }
    public static void main(String[] args){
        Mascota mascota1 = new Mascota();

        mascota1.nombre = "Firu";
        mascota1.energia = 100;
        mascota1.mostrarDatos();
        mascota1.jugar(10);
        mascota1.mostrarDatos();
        mascota1.dormir(2);
        mascota1.mostrarDatos();

    }

}
