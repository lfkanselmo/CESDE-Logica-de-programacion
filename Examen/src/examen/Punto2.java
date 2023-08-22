/*
Cree una matriz  3 * 3 en la que almacene las edades de sus familiares mas allegados. 
Cree un loop que recorra e imprima la matriz.​
 */
package examen;

import java.util.Scanner;

/**
 *
 * @author Krausser
 */
public class Punto2 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        int[][] edades = new int[3][3];
        
        for (int i = 0; i < edades.length; i++) {
            for (int j = 0; j < edades[i].length; j++) {
                int n;
                if (i == 0) {
                    n = j;
                } else if(i == 1){
                    n = j + 3;
                } else{
                    n = j + 6;
                }
                System.out.println("Ingrese edad " + (n+1));
                edades[i][j] = read.nextInt();
            }
        }
        
        for (int[] fila : edades) {
            for (int edad : fila) {
                System.out.println(edad);
            }
        }
    }
}
