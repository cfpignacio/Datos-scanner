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
        // utilizar println para que muestre el text y haga un salto de linea
        // por eso utilizamos para leer el metodo nextLine() y leemos la siguiente linea
        
        
        String nombre,apellido,direccion;
        int edad;
        
        Scanner leer = new Scanner(System.in);
        
        // Nombre
        System.out.println("Ingrese su Nombre:");
        nombre = leer.nextLine();
        
        // Apellido
        System.out.println("Ingrese su Apellido: ");
        apellido = leer.nextLine();
        
        // Direccion 
        System.out.println("Ingrese su direccion: ");
        direccion = leer.nextLine();
        
        // Edad
        System.out.println("Ingrese su edad: ");
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
