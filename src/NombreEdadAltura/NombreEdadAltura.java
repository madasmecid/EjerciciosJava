package NombreEdadAltura;
import java.util.Scanner;

public class NombreEdadAltura {

	public static void main(String[] args) {
		//
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Ingrese nombre edad altura: ");
		
		String nombre = teclado.next();
		
		int edad = teclado.nextInt();
		
		double altura = teclado.nextDouble();
		
		
	
		System.out.println("Nombre: " + nombre + "edad: " + edad + "Altura: " + altura);

	}

}
