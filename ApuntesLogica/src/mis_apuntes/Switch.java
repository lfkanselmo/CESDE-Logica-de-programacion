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
    static boolean pass = false;

    public static void main(String[] args) {

        int num1 = 0, num2 = 0;

        num1 = validation("Ingrese número 1: ");
        num2 = validation("Ingrese número 2: ");

        menu(num1, num2);

    }

    //Metodo para el menú
    public static void menu(int num1, int num2) {

        int opcion;
        do {

            System.out.println("");
            System.out.println("Seleccione operación deseada");
            System.out.println("1. suma");
            System.out.println("2. resta");
            System.out.println("3. multiplicación");
            System.out.println("4. división");
            System.out.println("5. salir");
            System.out.println("");

            opcion = validation("Elija una opción: ");
            System.out.println("");
            pass = false;

            switch (opcion) {
                case 1:
                    sumar(num1, num2);
                    break;
                case 2:
                    restar(num1, num2);
                    break;
                case 3:
                    multi(num1, num2);
                    break;
                case 4:
                    divi(num1, num2);
                    break;
                case 5:
                    System.out.println("Calculadora finalizada. Adios");                    
                    pass = true;
                    break;
                default:
                    System.out.println("Opción no valida, intente de nuevo");
                    break;

            }

        } while (pass == false);
    }

    //Función para sumar
    public static void sumar(int num1, int num2) {
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        System.out.println("");
    }

    //Función para restar
    public static void restar(int num1, int num2) {
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        System.out.println("");
    }

    //Función para multiplicar
    public static void multi(int num1, int num2) {
        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
        System.out.println("");
    }

    //Función para dividir
    public static void divi(int num1, int num2) {
        double div;

            div = (double) ( (double)(num1) / (double) (num2));
            System.out.println(num1 + " / " + num2 + " = " + div);
            if(num2 == 0){
                System.out.println("No se puede dividir entre cero. Resultado indeterminado");
            }
            System.out.println("");
 
    }

    //Función para validar ingreso de número
    public static int validation(String cadena) {
        int num = 0;

        do {
            try {
                System.out.println(cadena);
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
