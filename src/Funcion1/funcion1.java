package Funcion1;

public class funcion1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2, resultadoSuma, resultadoResta, resultadoMulti;
		
		double resultadoDivi;
		
		num1 = 10;;
		
		num2 = 20;
		
		resultadoSuma= suma(num1, num2);
		
		resultadoResta = resta(num1, num2);
		
		resultadoMulti = multi(num1, num2);
		
		resultadoDivi = divi(num1, num2);
		
		
		
		System.out.println("El resultado de la suma es: " + resultadoSuma);
		System.out.println("EL resultado de la resta es: " + resultadoResta);
		System.out.println("EL resultado de la multiplicación es: " + resultadoMulti);
		System.out.println("El resultado de la división es: " + resultadoDivi);
        
	}
	
	static int suma(int num1, int num2){
		
		return num1 + num2;
	}
	
	
	static int resta(int num1, int num2) {
		
		return num1 - num2;
		
	}
	
	static int multi (int num1, int num2) {
		
		return num1 * num2;
		
	}
	
	static double divi(double num1, double num2) {
	
	return num1 / num2;
	}
	
	
		
	


}
