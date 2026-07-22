package Menu;
import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		// menu con metodos de a poco
		
		Scanner teclado = new Scanner(System.in);
		
		int opcions = -1;
		
		menu();
		
		opcions = opcionMenu(opcions, teclado);
		
		switch(opcions) {
		case 1:
			int resultado = 7+5;
			System.out.println(resultado);
		}
		

	}
	
	
	static void menu() {
		System.out.println("======== MENU PRINCIPAL========");
		System.out.println("1. SUMAR");
		System.out.println("2. RESTAR");
		System.out.println("3. MULTIPLICAR");
		System.out.println("4. CONTAR LETRAS");
		System.out.println("5. SALIR");
		
	
	}
	
	static int opcionMenu(int opcion, Scanner teclado) {
		System.out.println("Ingrese una opcion: ");
		    opcion = teclado.nextInt();
		if (opcion >= 1 && opcion <= 5) {
			return opcion;
		}
		return -1;
	}

}
