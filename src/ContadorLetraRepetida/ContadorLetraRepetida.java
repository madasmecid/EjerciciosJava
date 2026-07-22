package ContadorLetraRepetida;
import java.util.Scanner;

public class ContadorLetraRepetida {

	public static void main(String[] args) {
		// Contador de letras que se repiten en una palabra
		
		Scanner teclado = new Scanner(System.in);
		
		String palabra;
		
		char letra;
		
		letra = 'a';
		
		int contador;
		
		contador = 0;
		
		System.out.println("Ingrese su palabra: ");
		palabra = teclado.nextLine();
		
		for (int i = 0; i < palabra.length(); i++) {
			
			if (letra == palabra.charAt(i)) {
				contador += 1;
				
			}
			
		
		}
		
		System.out.println("El total de letras "+letra + " es: " + contador);
		teclado.close();

	}

}
