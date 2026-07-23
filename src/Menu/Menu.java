package Menu;
import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		// menu con metodos de a poco probando
		
		Scanner teclado = new Scanner(System.in);
		
		int opcions = -1;
		int sumar = 0;
		
		menu();
		
		opcions = opcionMenu(opcions, teclado);
		
		switch(opcions) {
		case 1:
			System.out.println("Ingrese el primer numero a sumar: ");
			int num1 = teclado.nextInt();
			System.out.println("Ingrese el segundo numero para sumar: ");
			int num2 = teclado.nextInt();
			sumar = suma(num1, num2);
			System.out.println("el resultado de la suma es: " +sumar);
			break;
		case 2:
			int resta = 9-4;
			System.out.println("El resultado de la resta es " + resta);
		case 3:
			int multi = 4 * 6;
			
			System.out.println("EL resultado de la multiplicaicon es: "  + multi);
			
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
	
	static int suma(int num1, int num2) {
		return num1 + num2;
	}

}
