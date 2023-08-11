/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mis_apuntes;

import java.util.Scanner;

/**
 *
 * @author desarrollo
 */
public class Array {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        String names[] = new String[4];

        for (int i = 0; i < names.length; i++) {
            System.out.println("Ingrese nombre: ");
            names[i] = read.nextLine();
        }

        System.out.println("-------------------------------------------------");
        System.out.println();
        
        for (String name : names) {
            System.out.println(name);
        }
    }
}
