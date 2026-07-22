package CualEsMayor;
import java.util.Scanner;

public class CualEsMayor {

	public static void main(String[] args) {
		// Cual numero ingresado es mayor
		
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.print("Ingrese el primer numero: ");
		
		int num1 = teclado.nextInt();
		
		System.out.print("Ingrese el segundo numero: ");
		
		int num2 = teclado.nextInt();
		
		if (num1 > num2) {
			System.out.println("El numero mayor es: " +num1);
		} else if ( num1 < num2) {
			System.out.println("EL numero mayor es: " +num2);
		}else {
			System.out.println("Los numeros son iguales.");
		}
		teclado.close();
	}

}
