/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repaso;

import java.util.Scanner;

/**
 *
 * @author marco
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int edad;
        String nombre, ciudad;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Cual es tu nombre: ");
        
        nombre = teclado.nextLine();
        
        System.out.println("Cual es tu ciudad: ");
        
        ciudad = teclado.nextLine();
        
        System.out.println("Ingrese su edad: ");
        
        edad = teclado.nextInt();
        
        System.out.println("Hola " + nombre + " eres de " + ciudad + " y tienes " +edad + " años");
        
        if (edad >= 18) {
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("Eres menor de edad.");
        }
        
        
    }
    
}
