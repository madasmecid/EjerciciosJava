package PuedeVotar;

import java.util.Scanner;


public class PuedeVotar {

	public static void main(String[] args) {
		// si es mayor de edad puede votar
		
		Scanner teclado = new Scanner(System.in);
		
		int mayor_edad = 18;
		
		System.out.println("Ingrese su edad: ");
		
		int edad = teclado.nextInt();
		
		
		if (edad >= mayor_edad) {
			System.out.println("Usted si puede votar.");
		} else {
			System.out.println("Usted no puede votar por ser menor de edad.");
		}
		teclado.close();

	}

}
