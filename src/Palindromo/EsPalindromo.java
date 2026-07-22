package Palindromo;
import java.util.Scanner;

public class EsPalindromo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.print("Ingrese la cadena: ");
		
		String cadena = teclado.next().toLowerCase();		
		String reversa = "";
		
		for (int i = cadena.length()-1; i >= 0; i--) {
			reversa += cadena.charAt(i);
			
		}
		
		if (cadena.equals(reversa)) {
			System.out.println("Es palindromo");
		} else {
			System.out.println("No es un palindromo.");
		}
		System.out.println(reversa);
		
		teclado.close();
	}

}
