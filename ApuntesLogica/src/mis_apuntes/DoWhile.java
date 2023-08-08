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
public class DoWhile {

    static Scanner read = new Scanner(System.in);

    public static void main(String[] args) {
        boolean exit = true;
        int opc = 1;

        do {
            System.out.println("El area es: " + calcularArea());          
            System.out.println("Veces calculadas: " + opc++);
            System.out.println();
            
            if (opc == 6) {
                exit = false;
            }
            
            
        } while (exit);
    }

    public static int calcularArea() {

        System.out.println("Ingrese lado 1: ");
        int lado1 = read.nextInt();
        System.out.println("Ingrese lado 2: ");
        int lado2 = read.nextInt();
        return lado1 * lado2;

    }
}
