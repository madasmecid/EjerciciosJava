package TablasMultiplicar;
import java.util.Scanner;

public class TablaMultiplicar {

	public static void main(String[] args) {
		// Tablas de multiplicar
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Ingrese un numero entre 1 a 100: ");
		int num = teclado.nextInt();
		
		System.out.println("Tabla del " + num);
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(num + " X " + i + " = "+(num*i));
		}
		
		teclado.close();

	}

}
/*Este ejercicio imprime la tabla de multiplicar. Usamos la utilidad Scanner para solicitar
 * un numero al usuario y lo guardamos en la variable entera num, mostramos por mensaje
 * que la tabla a mostar sera de ese numero que ingreso el usuario. Iniciamos un ciclo for
 * el indice sera entero con valor de 1, el ciclo funcionará cuando sea menor o igual a
 * 10 que es hasta donde se multiplicara el numero guardado en la variable num.
 * El ultimo parametro del ciclo es 1++ que indicaque la variable i aumenta de 1 en 1.
 * (es lo mismo que i += 1 y lo mismo que i = 1+1.)
 *  Al final le mostramos al usuario el resultado en un formato de tabla y cerramos El teclado
 *  con teclado.close();  
 */
