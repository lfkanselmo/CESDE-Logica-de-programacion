/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mis_apuntes;

/**
 *
 * @author Krausser
 */
public class ArrayMultidimensional {
    public static void main(String[] args) {
        int[][] numeros = {{5,2,4},{5,8,3},{2,4,7}};
        
        
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.print("[" + numeros[i][j] + "] ");
            }
            System.out.println();
        }
    }
}
