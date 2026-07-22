package PrimerMenu;
import java.util.Scanner;

public class PrimerMenu {

	public static void main(String[] args) {
		// primer menu
		Scanner teclado = new Scanner(System.in);
		
		int opcion;
		do {
		
			do{
			System.out.println("1- Buenos dias.");
			System.out.println("2- Buenas tardes");
			System.out.println("3- Buenas Noches");
			System.out .println("4- salir");
			System.out.println("Ingrese una opcion: ");
			opcion = teclado.nextInt();
			
			} while(opcion < 1 || opcion > 4);
			switch (opcion) {
			case 1:
				System.out.println("Buenos dias");
				break;
			case 2:
				System.out.println("Buenas tardes");
				break;
			case 3:
				System.out.println("Buenas noches");
				break;
			case 4:
				System.exit(0);
				break;
			}
		}while(opcion != 4);
	    
		teclado.close();
	}

}
