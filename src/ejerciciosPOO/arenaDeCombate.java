package ejerciciosPOO;

public class arenaDeCombate {

    String nombre;
    int vida;
    int ataque;

    public arenaDeCombate(String nombre, int vida, int ataque) {
        this.nombre = nombre;
        this.vida = vida;
        this.ataque = ataque;
    }

    public void mostrarDatos() {
        System.out.println("\nNombre: " + nombre);
        System.out.println("Vida: " + vida);
        System.out.println("Ataque: " + ataque);
    }

    public void atacar ( arenaDeCombate enemigo) {
        System.out.println(nombre + " ataca con " + ataque + " puntos a " + enemigo.nombre);
        enemigo.vida = enemigo.vida - ataque;

    }

    public static void main (String[] args) {

        arenaDeCombate heroe = new arenaDeCombate("Marco", 100, 15);

        heroe.mostrarDatos();


        arenaDeCombate orco = new arenaDeCombate("Orco", 80, 10);
        orco.mostrarDatos();

        heroe.atacar(orco);

        orco.mostrarDatos();

    }
}
