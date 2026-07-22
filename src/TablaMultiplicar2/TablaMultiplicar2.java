package TablaMultiplicar2;


public class TablaMultiplicar2 {

	public static void main(String[] args) {
//		// Tablas de multiplicar 2.0

		
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.println(i + " X " + j + " = "+(i*j));
			}
			
			System.out.println("");
		}

	}

}
/*En esta versión de las tablas de multiplicar se usa dos ciclos for, uno captura el primer
 * numero de la tabla de multiplicar y el segundo ciclo captura el segundo numero, toma i
 * que inicia en 1 y el ciclo funciona hasta que sera menor o igual a 10 y la variable i
 * aumenta de 1 en 1 y va mastrando en que tabla vas, tabla 1, tabla 2 hasta tabla 10.
 *  El segundo ciclo inicia la variable j que inicia en 0 y funciona el ciclo
 * hasta mientras j sea menor a 10 y aumenta j en  1 en 1, esto quiere decir que se multiplicará 
 * hasta 10. hacemos un print con el formato de tabla y agregamos un print vacio para hacer el espacio
 * entre tablas de multiplicar.
 * En este ejercicio no usamos Scanner para pedir datos al usuario.
 */
