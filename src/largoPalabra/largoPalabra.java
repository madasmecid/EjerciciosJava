package largoPalabra;
import java.util.Scanner;

public class largoPalabra {

	public static void main(String[] args) {
		// medir el largo de la palabra ingresada
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Ingrese la palabra: ");
	
		String palabra = teclado.nextLine();		
		
		
		
		System.out.print("El largo de la palabra ingresada es: " + palabra.length());

	}

}
