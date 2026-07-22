package numeroParMetodo;
import java.util.Scanner;

public class numeroParMetodo {

	public static void main(String[] args) {
		// numero par o impar con metodo
		
		Scanner teclado = new Scanner(System.in);
		
		int numero;
		
		System.out.println("ingrese el numero: ");
		
		numero = teclado.nextInt();
		
		if (esPar(numero)) {
			System.out.println("Es par");
		} else {
			System.out.println("Es impar");
		}
		
		teclado.close();
	}
	static boolean esPar(int numero) {
		
		return numero %2 == 0;
	}
}
