package SumaDeNumerosFor;
import java.util.Scanner;

public class SumaNumerosFor {

	public static void main(String[] args) {
		// suma de numeros en for
		
		Scanner teclado= new Scanner(System.in);
		
		int numero, totalAcumulado;
		
		totalAcumulado = 0;
		
		
		System.out.println("Ingrese un numero: ");
		numero = teclado.nextInt();
		
		for (int i = 1; i <= numero; i++) {
			totalAcumulado += i;
		}
		
		System.out.println("EL acumulado es: " + totalAcumulado);
		
		
		teclado.close();

	}

}
