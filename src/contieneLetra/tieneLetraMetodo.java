package contieneLetra;

import java.util.Scanner;

public class tieneLetraMetodo {

	public static void main(String[] args) {
		// la palabra tiene la letra a?

		Scanner teclado = new Scanner(System.in);

		String palabra;

		System.out.println("Ingrese la palabra: ");

		palabra = teclado.nextLine();

		if (contieneA(palabra)) {
			System.out.println("La palabra contiene la letra a.");
		} else {
			System.out.println("La palabra NO contiene la letra a.");
		}

		teclado.close();

	}

	static boolean contieneA(String palabra) {

		for (int i = 0; i < palabra.length(); i++) {
			char letra = palabra.charAt(i);
			if (letra == 'a') {
				return true;
			}
				
		
			}
		return false;
		
	}

}
