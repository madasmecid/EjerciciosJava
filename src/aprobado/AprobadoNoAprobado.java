package aprobado;
import java.util.Scanner;
public class AprobadoNoAprobado {

	public static void main(String[] args) {
		// alumno aprobo o no
		
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Escriba su nota: ");
		
		double nota = teclado.nextDouble();
		
		double notaAProbado = 4.0;
		
		if (nota >= notaAProbado) {
			System.out.print("Usted a aprobado");
		} else {
			System.out.print("Usted Reprobo.");
		}
		
		teclado.close();
	}

}
