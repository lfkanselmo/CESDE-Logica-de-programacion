/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mis_apuntes;

import java.util.Scanner;

/**
 *
 * @author 503
 */
public class TheGame {

    static Scanner read = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {
        int lifes = 5, points = 0, num = -1;

        while (lifes > 0) {

            num = (int) (Math.random() * 100);

            if (num == 0) {
                lifes--;
                System.out.println();
                System.out.println("Te quedan: " + lifes + " vidas");
                System.out.println();
                
            } else {
                points++;
                System.out.println("has ganado " + points + " puntos hasta ahora");
            }
        }
    }
}
