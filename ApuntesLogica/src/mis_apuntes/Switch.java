/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mis_apuntes;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Krausser
 */
public class Switch {

    static Scanner read = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {

        boolean pass = true;
        int opcion;
        double resultado;
        int num1 = 0, num2 = 0;
        

        do {
            try {
                System.out.println("Ingrese número 1: ");
                num1 = read.nextInt();
                pass = true;
            } catch (InputMismatchException e) {
                System.out.println(e.getMessage());
                pass = false;
                num1 = -1;
            }

        } while (pass == false);

        do {
            try {
                System.out.println("Ingrese número 2: ");
                num2 = read.nextInt();
                pass = true;
            } catch (InputMismatchException e) {
                System.out.println(e.getMessage());
                pass = false;
                num2 = -1;
            }

        } while (pass == false);

        do {
            System.out.println("Bievenido");
            System.out.println("Elija una opción: ");
            System.out.println("1. suma");
            System.out.println("2. resta");
            System.out.println("3. multiplicación");
            System.out.println("4. división");
            System.out.println("5. salir");

            try {
                opcion = read.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Válor ingresado no valido");
                opcion = -1;
            }

            switch (opcion) {
                case 1:
                    

            }

        } while (pass == false);
    }
    
    

}
