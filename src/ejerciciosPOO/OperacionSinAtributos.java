package ejerciciosPOO;

public class OperacionSinAtributos {

    //Metodos

    //Metodo para sumar ambos numeros
    public int sumar(int numero1, int numero2) {
        return numero1 + numero2;
    }

    public int restar(int numero1, int numero2) {
        return numero1 - numero2;
    }

    public int multiplicar(int numero1, int numero2) {
        return numero1 * numero2;
    }

    public int dividir (int numero1 , int numero2) {
        return numero1 / numero2;
    }

    public void mostrarREsultados(int suma, int resta, int multiplicacion, int division) {
        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplicacion es: " + multiplicacion);
        System.out.println("La division es: " + division);
    }
}
