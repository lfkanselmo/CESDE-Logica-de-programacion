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
public class TemperaturaConversor {

    static Scanner read = new Scanner(System.in);

    public static void main(String[] args) {
        boolean exit = true;
        int cont = 1;

        do {
            System.out.println("Grados en Celsius: " + converter());

            boolean answer = true;

            if (cont <= 3) {
                do {
                    System.out.println("¿desea seguir convirtiendo?  S/N");
                    String opc = read.nextLine().toUpperCase();
                    switch (opc) {
                        case "S":
                            exit = true;
                            answer = false;
                            cont++;
                            break;
                        case "N":
                            exit = false;
                            System.out.println("Fin programa");
                            answer = false;
                            break;
                        default:
                            exit = true;
                            answer = true;
                            System.out.println("Respuesta ingresa no correcta...");
                            break;

                    }

                } while (answer);
            } else {
                exit = false;
                System.out.println("Fin programa");
            }

        } while (exit);

    }

    //Función para convertir
    public static double converter() {
        System.out.println("Ingrese temperatura en grados Farhenheit: ");
        double tem = read.nextDouble();
        read.skip("\n");
        return ((tem - 32.0) * (5.0 / 9.0));
    }

}
