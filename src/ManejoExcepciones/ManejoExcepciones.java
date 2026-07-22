package ManejoExcepciones;
import java.util.Scanner;

public class ManejoExcepciones {

	public static void main(String[] args) {
		// manejo de excepciones
		
		
		Scanner teclado = new Scanner(System.in);
		
		int edad;
		while (true) {
			System.out.println("Ingrese su edad: ");
			try { 
			    edad = teclado.nextInt();
			    System.out.println("Su edad es: " + edad);
			    break;
			}
			catch (Exception e) {
				System.out.println("Debe ingresar un numero.");
				teclado.nextLine();
			
		}
		
		}
		teclado.close();

	}

}
