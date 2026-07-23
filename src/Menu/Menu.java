package Menu;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		// menu con metodos de a poco probando

		Scanner teclado = new Scanner(System.in);

		int opcions = -1;
		int sumar = 0, restar = 0, multiplicar = 0, conteo = 0;

		do {
			menu();

			opcions = opcionMenu(teclado);

			switch (opcions) {
			case 1:{

				System.out.println("Ingrese el primer numero a sumar: ");
				int marco = teclado.nextInt();

				System.out.println("Ingrese el segundo numero para sumar: ");
				int juan = teclado.nextInt();
				sumar = suma(marco, juan);
				System.out.println("el resultado de la suma es: " + sumar);
				break;
			}
			case 2:
				System.out.println("Ingrese el primer numero a restar: ");
				int num1r = teclado.nextInt();
				System.out.println("Ingrese el segundo numero para restar: ");
				int num2r = teclado.nextInt();
				restar = resta(num1r, num2r);
				System.out.println("el resultado de la resta es: " + restar);
				break;
			case 3:
				System.out.println("Ingrese el primer numero a multiplicar: ");
				int num1m = teclado.nextInt();
				System.out.println("Ingrese el segundo numero para multiplicar: ");
				int num2m = teclado.nextInt();
				multiplicar = multip(num1m, num2m);
				System.out.println("el resultado de la multiplicación  es: " + multiplicar);
				break;
			case 4:

				System.out.println("Ingrese la palabra: ");

				String palabra = teclado.next();

				conteo = contarLetras(palabra);

				if (conteo > 0) {
					System.out.println("La cantidad de letras de su palabra es: " + conteo);
				} else {
					System.out.println("Error debe ingresar una palabra");
				}
				break;
			case 5:
				System.out.println("Gracias por usar nuetro programa....");

			default:
				System.out.println("Opcion no valida, vuelva a intentarlo.");

			}

		} while (opcions != 5);
	}

	static void menu() {
		System.out.println("======== MENU PRINCIPAL========");
		System.out.println("1. SUMAR");
		System.out.println("2. RESTAR");
		System.out.println("3. MULTIPLICAR");
		System.out.println("4. CONTAR LETRAS");
		System.out.println("5. SALIR");

	}

	static int opcionMenu(Scanner teclado) {
		int opcion;

		while (true) {
			try {
				System.out.println("Ingrese una opcion: ");
				opcion = teclado.nextInt();

				if (opcion >= 1 && opcion <= 5) {
					return opcion;

				}
				System.out.println("la opcion debe estar entre 1 y 5.");
			} catch (Exception e) {
				System.out.println("Debe ingresar un numero.");
				teclado.nextLine();
			}
		}
	}

	static int suma(int num1, int num2) {
		return num1 + num2;
	}

	static int resta(int num1, int num2) {
		return num1 - num2;
	}

	static int multip(int num1, int num2) {
		return num1 * num2;
	}

	static int contarLetras(String palabra) {
		return palabra.length();
	}

}
