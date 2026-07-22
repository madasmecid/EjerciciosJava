package MayorMenor;
import java.util.Scanner;
public class MayorMEnor {

	public static void main(String[] args) {
		// comprobar si tu numero es mayor o menor
		
		Scanner teclado = new Scanner(System.in);
		
		int numero = 35;
		
		System.out.println("EL numero guardados es: " + numero);
		
		System.out.print("Ingrese su numero");
		
		int numUsuario = teclado.nextInt();
		
		
		if (numUsuario > numero) {
			System.out.println("Su numero es mayor.");
		} else if (numUsuario < numero) {
			System.out.println("Su numero es menor.");
		} else {
			System.out.println("Numeros son iguales.");
		}
		
	
	
	}

}
