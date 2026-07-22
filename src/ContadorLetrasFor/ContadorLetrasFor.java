package ContadorLetrasFor;
import java.util.Scanner;

public class ContadorLetrasFor {

	public static void main(String[] args) {
		// muesta letra por letra de una palabra
		
		Scanner teclado = new Scanner(System.in);
		
		String palabra, letra;
		
		System.out.println("Ingrese una palbra: ");
		palabra = teclado.nextLine();
		
		
		for  (int i = 0;i < palabra.length(); i++){
			System.out.println(palabra.charAt(i));
		}
		teclado.close();

	}

}
