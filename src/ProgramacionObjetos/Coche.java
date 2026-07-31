package ProgramacionObjetos;

public class Coche {
	
	String color;
	
	String marca;
	
	int kilometros;
	
	public void mostrarDatos() {
		System.out.println("\ncolor: " + color);
		System.out.println("Marca: " +marca);
		System.out.println("Kilometros: " + kilometros);
		
		}
	
	
	public static void main (String [] args) {
		
		
		Coche coche1 = new Coche();
		
		coche1.color = "Azul";
		
		coche1.marca = "Audi";
		
		coche1.kilometros = 0;
		
		coche1.mostrarDatos();
		
		
		Coche coche2 = new Coche();
		
		coche2.color = "Rojo";
		
		coche2.marca = "Ferrari";
		
		coche2.kilometros = 90;
		
		coche2.mostrarDatos();
		
		Coche coche3 = new Coche();
		
		coche3.color = "Blanco";
		
		coche3.marca = "Fiat";
		
		coche3.kilometros = 4000;
		
		coche3.mostrarDatos();
		
		}
	
	
	
}
