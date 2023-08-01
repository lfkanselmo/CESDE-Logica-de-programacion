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
public class CicloWhile {

    static Scanner read = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {

        int points = 0;
        int seconds = 0;

        while (seconds <= 30) {
            seconds++;
            System.out.println("Tiene " + points + " puntos");
            points += 10;
        }

        seconds = 0;

        System.out.println();
        System.out.println();

        while (seconds <= 30) {
            seconds++;
            System.out.println("Tiene " + points + " puntos");
            System.out.println();
            System.out.println("han pasado " + seconds + " segundos");
            points -= 10;
        }
    }
}
