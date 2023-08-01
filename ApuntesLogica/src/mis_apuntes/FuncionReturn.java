/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mis_apuntes;

import java.util.Scanner;

/**
 *
 * @author krausser
 */
public class FuncionReturn {

    static Scanner read = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {
        
        System.out.println("Ingrese valor de lado A");
        double ladoA = read.nextDouble();
        System.out.println("Ingrese valor de lado B");
        double ladoB = read.nextDouble();
        System.out.println("El area es: " + calcularArea(ladoA,ladoB) + " unidades cuadradas");
    }

    public static double calcularArea(double ladoA, double ladoB) {
        return ladoA * ladoB;
    }
}
