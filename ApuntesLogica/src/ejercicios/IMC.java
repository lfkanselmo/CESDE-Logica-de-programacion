/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author 505
 */
public class IMC {

    static Scanner read = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {
        System.out.println("Ingrese altura");
        double altura = read.nextDouble();
        System.out.println();
        System.out.println("Ingrese el peso");
        double peso = read.nextDouble();
        System.out.println();

        double imc = peso / (altura * altura);

        if (imc < 18.5) {
            System.out.println("IMC es: " + imc);
            System.out.println("Bajo peso");
        } else if (imc >= 18.5 && imc <= 24.99) {
            System.out.println("IMC es: " + imc);
            System.out.println("Normal");
        } else if (imc >= 25 && imc <= 29.99) {
            System.out.println("IMC es: " + Math.round(imc));
            System.out.println("Sobre peso");
        } else if (imc >= 30.0) {
            System.out.println("IMC es: " + Math.round(imc));
            System.out.println("Obesidad");
        }
    }
}
