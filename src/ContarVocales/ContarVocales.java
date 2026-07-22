package ContarVocales;
import java.util.Scanner;

public class ContarVocales {

	public static void main(String[] args) {
		// cuenta las vocales de una palabra
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Ingrese la palabra: ");
		
		String palabra = teclado.next().toLowerCase();
		
		int vocales = 0;
		
		for (int i = 0; i < palabra.length(); i++) {
			char letra = palabra.charAt(i);
			
			if(letra == 'a' ||
			   letra == 'e' ||
			   letra == 'i' ||
			   letra == 'o' ||
			   letra == 'u') {
			   
				vocales ++;
			}
			   
		}
		
		System.out.print("La palabra tiene un total de vocales de: " + vocales);

	}

}
