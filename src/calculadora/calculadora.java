package calculadora; 
import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {
		// Calculadora
		
		Scanner teclado = new Scanner(System.in);
		
		int opcion;
		double num1, num2;
		
		while (true) {
			
			System.out.println("1. Sumar");
			System.out.println("2. Restar");
			System.out.println("3. Multiplicar");
			System.out.println("4. dividir");
			System.out.println("5. Salir");
			System.out.println("\nIngrese una opcion: ");
			opcion = teclado.nextInt();
			
			switch (opcion) {
			
			case 1:
				System.out.print("Ingrese el numero 1 para sumar: ");
				num1 = teclado.nextInt();
				System.out.println("Inmgrese el segundo numero para sumar: ");
				num2 = teclado.nextInt();
				System.out.println("El resultado es: " + (num1+num2));
				break;
			case 2:
				System.out.print("Ingrese el numero 1 para restar: ");
				num1 = teclado.nextInt();
				System.out.print("Inmgrese el segundo numero para restar: ");
				num2 = teclado.nextInt();
				System.out.println("El resultado es: " + (num1-num2));
				break;
			case 3:
				System.out.println("Ingrese el numero 1 para multiplicar: ");
				num1 = teclado.nextInt();
				System.out.println("Inmgrese el segundo numero para multiplicar: ");
				num2 = teclado.nextInt();
				System.out.println("El resultado es: " + (num1 * num2));
				break;
			case 4:
				System.out.println("Ingrese el numero 1 para dividir: ");
				num1 = teclado.nextInt();
				System.out.println("Inmgrese el segundo numero para dividir: ");
				num2 = teclado.nextInt();
				if (num2 == 0) {
					System.out.println("No se puede dividir por 0.");
				}else {
					System.out.println("El resultado es: "+ (num1 / num2 ));
				}
				break;
			case 5:
				System.out.println("Adios gracias por usar nuestra calculadora");
				System.exit(0);
			default:
				System.out.println("Opcion no valida");
				break;
				
			}
			
		}

	}

}
