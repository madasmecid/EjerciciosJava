package ContarLetrasMetodo;
import java.util.Scanner;

public class contarLetrasMetodo {

	public static void main(String[] args) {
		// Metodo de contar letras
		
		Scanner teclado = new Scanner(System.in);
		
		String palabra;
		
		System.out.println("Ingrese la palabra: ");
		
		palabra = teclado.nextLine();
		
		int resultado = contarLetras(palabra);
		
		System.out.println("La palabra tiene "+resultado+ " letras.");
		teclado.close();

	}
	
	static int contarLetras(String palabra) {
		
		return palabra.length();
	
		
		
	}
}
