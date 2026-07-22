package TorreAsteriscos;
import java.util.Scanner;

public class TorreAsteriscos {

	public static void main(String[] args) {
		// Torre de asteriscos
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingresa numero de filas de la torre: ");
		int tamano = teclado.nextInt();
		
		for (int altura = 1; altura < tamano; altura++) {
			
			for (int e =1; e <= (tamano - altura); e++) {
				System.out.print(" ");
			}
			
			for (int i = 1; i <= (altura*2)-1; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		

	}

}
