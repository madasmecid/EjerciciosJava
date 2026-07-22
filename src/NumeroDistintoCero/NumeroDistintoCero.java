package NumeroDistintoCero;
import java.util.Scanner;

public class NumeroDistintoCero {

	public static void main(String[] args) {
		// acumular numeros distintos a 0
		
		Scanner teclado = new Scanner(System.in);
		
		int numero, total;
		numero = -1;
		total = 0;
		
		while(numero != 0) {
			System.out.println("ingrese un numero, si desea terminar ingrese 0 ");
			
			numero = teclado.nextInt();
			
			//teclado.nextLine();
			
			
			if (numero != 0) {
				total += 1;
			}else {
				System.out.println("El total de numeros ingresados fue: " + total);
			}
			}
	   
		teclado.close();
	
	}

}
