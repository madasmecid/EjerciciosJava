package PedirNumero;
import java.util.Scanner;

public class PedirNumero {

	public static void main(String[] args) {
		// Este programa pide numeros al usuario hasta que el diga stop
		
		Scanner teclado = new Scanner(System.in);
		int opcion = -1;
		int num = 0;
		
		while(opcion != 2) {
			System.out.print("Ingrese un numero: ");
			num = teclado.nextInt();
			
			System.out.print("¿Desea continuar? [1== si/ 2== no]: ");
			opcion = teclado.nextInt();
			
			if (opcion == 2) {
				System.out.println("Gracias por usar nuestro programa.");
			}
			
		
		}
		
		teclado.close();

	}

}
/*En este programa importamos la utilidad Scanner, creamos la variabe opcion con el valor
*entero de -1 y la variable num1 en valor 0 entero. creamos un ciclo while que funciona mientras
*opcion sea distinto a 2. Dentro del ciclo le pediomos al usuario que ingrese el numero y
*enseguia le preguntamos si desea continuar, si ingresa 1 continua, si ingresa 2 el valor de opcion
*cambia a 2, con una condicional le mostramos un mensaje de despedida y como el valor es igual 
*a 2 el ciclo termina dando por finalizado el programa. Este programa es para ver el flujo
*de un ciclo while y el control desde una variable que es opcion.
*/