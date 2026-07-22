package MayorCien;
import java.util.Scanner;

public class MayorCien {

	public static void main(String[] args) {
		// el numero es mayor a 100
		Scanner teclado = new Scanner(System.in);
		
		int numero;
		
		while (true) {
			System.out.println("Ingrese un numero: ");
			try {
				numero = teclado.nextInt();
				if (numero > 100) {
					System.out.println("Numero mayor a 100");
					break;
				} else {
					System.out.println("Numero menor o igual a 100");
					break;
				}
				
			}catch (Exception e) {
				System.out.println("Debe ingresar un numero entero");
				teclado.nextLine();
			}
		
		
		}
		teclado.close();
	}

}
