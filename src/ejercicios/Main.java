package ejercicios;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		
		System.out.print("Ingrese usuario: ");
		String usuario = teclado.nextLine();
		
		System.out.print("Ingrese contraseña: ");
		String contrasena = teclado.nextLine();
		int saldo = 5000;
		if (usuario.equals("marco") && contrasena.equals("1234")) {
			System.out.print("Ingrese monto a retirar: ");
			int retiro = teclado.nextInt();
			if (retiro > saldo) {
				System.out.println("Fondos insuficientes.");
			}		
			else {
				saldo -= retiro;
				System.out.println("Retiro exitoso");
				System.out.println("El nuevo saldo es: " + saldo);
				if (saldo >= 2000) {
					System.out.println("Saldo alto.");
				} else {
					System.out.println("Saldo bajo.");
				}
			}
		} else {
			System.out.println("Acceso denegado.");
		
		
			
		}
		
		
        teclado.close();
        
        
	}

}
