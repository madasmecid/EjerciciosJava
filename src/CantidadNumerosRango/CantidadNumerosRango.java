package CantidadNumerosRango;
import java.util.Scanner;

public class CantidadNumerosRango {

	public static void main(String[] args) {
		// Numeros en un rango
		
		Scanner teclado = new Scanner(System.in);
		
		int numero;
		
		System.out.print("Ingrese un numero: ");
		numero = teclado.nextInt();
		
		teclado.nextLine();
		
		
		for (int i = 1; i <=numero; i++) {
			System.out.println(i);
		}
		
		teclado.close();

	}

}
