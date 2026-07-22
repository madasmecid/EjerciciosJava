package SumaImpares;
import java.util.Scanner;

public class SumaImpares {

	public static void main(String[] args) {
		// suma de impares
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Ingrese un numero: ");
		
		int numero = teclado.nextInt();
		
		int total = 0;
		
		for (int i = 1; i <= numero; i++) {
			if (i %2 != 0) {
				total += i;
			}
		}
		
		System.out.print("EL total de la suma de impares es: " + total);
		
		teclado.close();

	}

}
/* En este ejercicio importo Scanner, le pido al usuario un numero, uso un ciclo for
 * con el que recorro del 1 hasta el limite que seria el numero que dio el usuario,
 * y el indice va aumentando de 1 en 1 (i) luego creo una condicional que pregunta
 * si el resto de la division en 2 del numero es distinto a 0 que eso daria el resultado
 * para encontrar un numero impar, si cumple a la variable total le sumamos la i de esa vuelta
 * hacemos lo mismo hasta terminar el ciclo sumando a total cada vuelta si esta es impar,
 * al final mostramos el total en pantalla
 
*/