/*
Empleando do- while, cree una funcionalidad que muestre permita agregar de manera 
continua 7 números a una lista y salga de la misma al finalizar.
 */
package examen;

import java.util.Scanner;

/**
 *
 * @author Krausser
 */
public class Punto6 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = 7;
        int m = 0;
        int[] numeros = new int[n];

        do {

            System.out.println("Ingrese número: ");
            numeros[m] = read.nextInt();
            System.out.println();
            m++;

        } while (m < n);

        for (int numero : numeros) {
            System.out.println("numero: " + numero);
        }
    }
}
