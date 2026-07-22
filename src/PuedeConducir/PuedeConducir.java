package PuedeConducir;
import java.util.Scanner;

public class PuedeConducir {

	public static void main(String[] args) {
		// puede conducir
		
		
		Scanner teclado = new Scanner(System.in);
		
		boolean licencia;
		String puede = "si";
		
		int edad;
		
		System.out.println("Ingrese su edad: ");
		edad = teclado.nextInt();
		teclado.nextLine();
		
		System.out.println("Tiene licencia: ");
		String si = teclado.nextLine();
		
		if (si.equals(puede)) { 
			licencia = true;
		}else {
			licencia = false;
		}
		
		if (edad >= 18 && licencia == true){
			System.out.println("Puede conducir");
		}else {
			System.out.println("NO puede conducir");
		}
		teclado.close();

	}

}
