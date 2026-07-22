package Pruebas;

import java.util.Scanner;

public class Pruebas {

	public static void main(String[] args) {
		// Ejercicios de copilot

		Scanner teclado = new Scanner(System.in);

		double nota;

		System.out.println("Ingrese su nota: ");
		nota = teclado.nextDouble();

		if (nota >= 6) {
			System.out.println("Excelente");
		} else if (nota >= 4 && nota < 6) {
			System.out.println("Aprobado");
		} else {
			System.out.println("Reprobado");
		}
		teclado.close();
	}

}
