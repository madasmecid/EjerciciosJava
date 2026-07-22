package NombreReconocido;
import java.util.Scanner;

public class NombreReconocido {

	public static void main(String[] args) {
		// nombre reconocido o no
		
		Scanner teclado = new Scanner(System.in);
		
		String nombre_guardado = "marco";
		
		
		System.out.print("Ingrese su nombre: ");
		
		String nombre = teclado.next();
		
		if (nombre.equals(nombre_guardado)) {
			System.out.print("Bienvenido " + nombre);
		} else {
			System.out.print("Usuario no reconocido");
		}
		
		teclado.close();

	}

}
