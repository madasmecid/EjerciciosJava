package NumeroEsPar;
import java.util.Scanner;

public class NumeroEsPar {

	public static void main(String[] args) {
		// Determina si un numero es par
		Scanner teclado = new Scanner(System.in);
		System.out.println("INgrese el numero que quiere saber si es par: ");
		int numero = teclado.nextInt();
		
		if (numero %2 == 0) {
			System.out.println("El numero es par.");
		} else {
			System.out.println("El numero es impar");
		}
		teclado.close();
	}

}


/* En este ejercicio llamamos la utilidad Scanner y le pedimos el numero al usuario
 * este lo guardamos como entero en la variable numero, luego creamos una condicional
 * en esta preguntamos si el resto del numero dividio por 2 es igual a 0,
 * si es 0 es numero par, sino es numero impar.
 */
