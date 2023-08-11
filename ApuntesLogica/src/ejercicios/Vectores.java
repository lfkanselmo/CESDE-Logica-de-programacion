/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author desarrollo
 */
public class Vectores {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        Integer[] computers = {21, 32, 30, 27, 21, 38, 36, 37};;
        Double[] salMins = {1160000.0, 1000000.0, 908526.0, 877803.0, 828116.0, 781242.0};
        Float[] notes = {2.2f, 1.9f, 3.7f, 4.1f, 5f, 3.3f, 2.8f, 3.1f, 1.8f};
        String[] socialNetworks = {"Facebook", "Instagram", "Twitter", "Reddit", "Tumblr", "LinkedIn"};
        String[] fruits = {"Fresa", "Pera", "Mango", "Maracuyá", "Pera", "Manzana"};


        showAll("Fruta ", fruits);

        showAll("Red social ", socialNetworks);

        showAll("Salario minimo del año ", salMins);

        showAll("Notas ", notes);

        showAll("Computadores en la sala ", computers);

    }

    //Metodo para imprimir cuando recibe arreglo
    public static void showAll(String cadena, Object[] vector) {
        System.out.println("----------------------------------------------------------");

        for (int i = 0; i < vector.length; i++) {
            switch (cadena) {
                case "Fruta ":
                case "Computadores en la sala ":
                case "Notas ":
                case "Red social ":
                    System.out.println(cadena + (i + 1) + ": " + vector[i]);
                    break;
                case "Salario minimo del año ":
                    System.out.println(cadena + (2023 - i) + ": " + vector[i]);
                    break;
                default:
                    System.out.println(" Error al ingresar cadena ");
            }
        }
        
        System.out.println("----------------------------------------------------------");
    }

}
