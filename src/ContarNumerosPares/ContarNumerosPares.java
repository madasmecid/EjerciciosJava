package ContarNumerosPares;
import java.util.Scanner;

public class ContarNumerosPares {

	public static void main(String[] args) {
		// Cuenta cuantos numeros pares en lo que ingreso el usuario
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Ingrese el numero: ");
		
		int numero = teclado.nextInt();
		int pares = 0;
		
		for (int i = 1; i <= numero; i++) {
			if (i %2 == 0) {
				 pares += 1;
			}
		}if (pares > 0) {
			System.out.print("El total de numeros pares es: " + pares);
		} else {
			System.out.print("No hay numeros pares");
		}
		teclado.close();

	}

}
