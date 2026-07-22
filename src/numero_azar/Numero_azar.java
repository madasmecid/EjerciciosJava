package numero_azar;

import java.util.Scanner;

import java.util.Random;

public class Numero_azar {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero = 0;
		// numero = (int)(Math.random() *100);
		Random random = new Random();
		System.out.print("Ingrese el incio del rango: ");
		int num1 = teclado.nextInt();
		System.out.print("INgrese el fin del rango: ");
		int num2 = teclado.nextInt();

		if (num1 > num2) {
			System.out.println("EL primer numero no puede ser mayor que el segundo.");
		} else {
			numero = random.nextInt(num1, num2 + 1);

			System.out.println("El numero al azar es: " + numero);
		}
		teclado.close();
	}

}

/*
 * Este ejercicio utiliza la utilidad scanner y ramdom, le pido dos numeros al
 * usuario y los guardo en las variables enteras num1 y num2. Creo la variable
 * numero con la utilidad ramdom (ramdom.nextInt() y dentro del rango meto las variables
 * num1 y num2 y a num2 le sumo 1 para que el fin del rango sea el numero que da el usuario
 * ya que ramdom solo usa el penultimo numero, si el usuario ingresa el num1 mayor que el
 * num2 le indico el error, si el usuario ingresa num1 menor que num2 entonces se genera el
 * numero al azar correctamente mostrandolo en pantalla.
 */