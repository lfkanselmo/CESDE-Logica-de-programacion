/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mis_apuntes;

import java.util.Scanner;

/**
 *
 * @author Krausser
 */
public class Arrays2 {
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        String[] flowers = {"tulipan","sunflower","rose", "loto","deisy"};
        
        
        // Flores
        System.out.println("La longitud del vector de flores es: " + flowers.length);
        System.out.println("La flor en la posición 0 es: " + flowers[0]);
        
        System.out.println();
        
        for(String flower: flowers){
            System.out.println(flower);
        }
        
        // Tallas de hombres
        
        System.out.println();
        System.out.println("----------------------------------------------------------------");
        System.out.println("Ingrese la cantidad de tallas ");
        int n = read.nextInt();
        int[] menSize = new int[n];
        int iniSize = 28;
        
        for (int i = 0; i < menSize.length; i++) {
            menSize[i] = iniSize;
            iniSize += 2;
        }
        
        for(int j=0 ; j< menSize.length; j++){
            System.out.println("La talla en la posición " + j + " es: " + menSize[j]);
        }
    }
}
