package NumerosParForIf;
import java.util.Scanner;

public class NumerosParForIf {

	public static void main(String[] args) {
		// muestra numeros pares en un rango
		
		Scanner teclado = new Scanner(System.in);
		
		int numero;
		
		
		System.out.println("Ingrese el numero: ");
		numero = teclado.nextInt();
		
		for (int i = 1; i <= numero; i++) {
			
			if (i %2 == 0) {
				System.out.println(i);
			}
		}
		
		teclado.close();
		

	}

}
