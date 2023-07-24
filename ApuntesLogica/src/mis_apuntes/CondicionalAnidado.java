/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mis_apuntes;

import java.util.Scanner;

/**
 *
 * @author Krausser
 */
public class CondicionalAnidado {

    static Scanner read = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {

        System.out.println("Ingrese la nota: ");
        double nota = read.nextDouble();

        if (nota >= 0 && nota < 2.0) {
            System.out.println("Reprobado");
        } else if (nota >= 2.0 && nota <= 2.9){
            System.out.println("Regular");
        } else if(nota >= 3.0 && nota <= 3.9){
            System.out.println("Básico");
        } else if (nota >= 4.0 && nota <=4.9){
            System.out.println("Superior");
        } else if (nota == 5.0){
            System.out.println("Excelente");
        } else{
            System.out.println("Nota no válida");
        }
    }
}
