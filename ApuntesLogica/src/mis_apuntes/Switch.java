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
    static boolean pass = true;

    public static void main(String[] args) {

        int opcion;
        double resultado;
        int num1 = 0, num2 = 0;

        num1 = validation();
        num2 = validation();

        menu();

    }

    //Metodo para el menú
    public static void menu() {
        do {

            pass = false;

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
                    sumar();
                    break;
                case 2:
                    restar();
                    break;
                case 3:
                    multi();
                    break;
                case 4:
                    divi();
                    break;
                case 5:
                    pass = true;
                default:
                    System.out.println("Opciòn no valida, intente de nuevo");
                    break;

            }

        } while (pass == false);
    }

    //Función para validar ingreso de número
    public static int validation() {
        int num = 0;

        do {
            try {
                System.out.println("Ingrese número: ");
                num = read.nextInt();
                pass = true;
            } catch (InputMismatchException e) {
                System.out.println("Valor ingresado no númerico. Intente de nuevo");
                pass = false;
                read.next();
            }

        } while (pass == false);

        return num;
    }

}
