/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author 503
 */
public class RetiroBancario {

    static double saldo = 300000.0;
    static Scanner read = new Scanner(System.in);

    public static void main(String[] args) {
        boolean exit = true;
        double money;
        do {
            System.out.println("¿Cuanto dinero desea retirar?");
            money = read.nextDouble();
            read.skip("\n");

            if (money <= 50000 && money <= saldo) {
                retiro(money);

                boolean exitOpc = true;

                do {
                    System.out.println("¿Desea realizar otro retiro? S/N");
                    String opc = read.next().toUpperCase();

                    switch (opc) {
                        case "S":
                            exit = true;
                            exitOpc = false;
                            break;
                        case "N":
                            exit = false;
                            exitOpc = false;
                            System.out.println("Fin programa");
                            break;
                        default:
                            System.out.println("Opción elegida invalida");
                            exitOpc = true;
                            break;
                    }
                } while (exitOpc);

            } else {
                if (money > 50000) {
                    System.out.println("Tope máximo de retiro es 50.000");
                    exit = true;
                } else {
                    System.out.println("No hay saldo suficiente. Se retirará el saldo disponible");
                    retiro(saldo);
                    exit = false;
                    System.out.println("fin programa");
                }
            }

        } while (exit);

    }

    //función para realizar retiros
    public static void retiro(double money) {
        saldo -= money;
        System.out.println("");
        System.out.println("Se retira: " + money);
        System.out.println("Nuevo saldo disponible: " + saldo);
        System.out.println("");
    }
}
