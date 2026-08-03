package ejerciciosPOO;

public class PersonajeRPG {

    String nombre;
    int vida;
    int ataque;


    public PersonajeRPG(String nombre, int vida, int ataque) {

        this.nombre = nombre;
        this.vida = vida;
        this.ataque = ataque;
    }

    public void atacar() {
        System.out.println(nombre +" ataca con " + ataque+ " puntos de daño");
    }

    public void mostrarDatos(){
        System.out.println("\nNombre: " + nombre);
        System.out.println("vida: " + vida);
        System.out.println("ataque: " + ataque);

    }

    public void entrenar (int entrenar) {
        this.ataque = ataque + entrenar;
    }

    public static void main(String[] args) {

        PersonajeRPG personaje1 = new PersonajeRPG("Marco", 100, 15);
        personaje1.mostrarDatos();
        personaje1.atacar();
        personaje1.entrenar(5);
        personaje1.mostrarDatos();
        personaje1.atacar();


        PersonajeRPG personaje2 = new PersonajeRPG("Orco", 80, 12);
        personaje2.mostrarDatos();
        personaje2.atacar();
        personaje2.entrenar(10);
        personaje2.mostrarDatos();
        personaje2.atacar();


    }

    }


