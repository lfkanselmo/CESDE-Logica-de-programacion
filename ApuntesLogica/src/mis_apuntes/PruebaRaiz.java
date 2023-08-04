/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mis_apuntes;

import java.util.Scanner;

/**
 *
 * @author 507
 */
public class PruebaRaiz {

    static Scanner read = new Scanner(System.in);
    
    public static void main(String[] args) {
        sqr();
    }

    private static void sqr() {
        
        System.out.println("Ingrese el número al que le quiere sacar raiz cuadrada");
        int num1 = read.nextInt();

        int conta = 1;
        int resul;

        int sqr = 0;

        boolean exit = false;

        while (exit == false && conta < num1) {
            resul = num1 / conta;

            if (resul == conta) {
                sqr = resul;
                exit = true;
            } else {
                sqr = 0;
                conta++;
                exit = false;
            }
        }

        if (sqr != 0) {
            System.out.println("raiz encontrada. Es igual a: " + sqr);
        } else {
            System.out.println("El número " + num1 + " no tiene raiz cuadrada exacta");
        }
    }
}
