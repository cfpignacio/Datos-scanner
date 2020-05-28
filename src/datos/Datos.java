/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;
import java.util.Scanner;
/**
 *
 * @author Notebook
 */
public class Datos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String nombre,apellido,direccion;
        int edad;
        
        Scanner leer = new Scanner(System.in);
        
        // Nombre
        System.out.print("Ingrese su Nombre:");
        nombre = leer.next();
        
        // Apellido
        System.out.print("Ingrese su Apellido: ");
        apellido = leer.next();
        
        // Direccion (ver) (nextLine)
        System.out.print("Ingrese su direccion: ");
        direccion = leer.next();
        
        // Edad
        System.out.print("Ingrese su edad: ");
        edad = leer.nextInt();
        
        // Muestro en pantalla las var ingresadas 
        System.out.println("Su nombre es: " + nombre);
        System.out.println("Su apellido es: " + apellido);
        System.out.println("Su direccion es: " + direccion);
        //System.out.println("Tiene " + edad + " años ");
        
        if(edad < 18){
         System.out.println("Tiene " + edad + " años ES MENOR DE EDAD");
        }else{
         System.out.println("Tiene " + edad + " años ES MAYOR DE EDAD");
        }
    }
    
}
