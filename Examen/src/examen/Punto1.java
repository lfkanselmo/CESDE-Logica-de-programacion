/*
Cree una funcionalidad  que guarde en un array 6 nombres de compañeros, 
cree un ciclo que permita recorrerlo, muestre la extensión del mismo. 
Capture los nombres mediante el sistema.
 */
package examen;

import java.util.Scanner;

/**
 *
 * @author Krausser
 */
public class Punto1 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String[] names = new String[6];
        
        System.out.println("Ingrese nombre de compañeros");
        for (int i = 0; i < names.length; i++) {
            System.out.println("Ingrese nombre: ");
            names[i] = read.nextLine();
        }
        
        mostrar(names);
        
        System.out.println("Extensión del arreglo: " + names.length);
    }
    
    //Metodo para mostrar los nombres
    public static void mostrar(String[] nombres){
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Compañero " + (i+1) + ": " + nombres[i]);
        }
    }
}
