/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mis_apuntes;

import java.util.Scanner;

/**
 *
 * @author 503
 */
public class Casos {
    static Scanner read = new Scanner(System.in).useDelimiter("\n");
    public static void main(String[] args) {
        menu();
    }
    
    
    
    //Metodo de menú
    public static void menu(){
        System.out.println("Elija una opción: ");
        System.out.println("1. calcular area");
        System.out.println("2. calcular perimetro");
        System.out.println("3. salir");
        
        int option = read.nextInt();
        
        double lado1, lado2, lado3, lado4;
        
        
        switch(option){
            case 1:
                System.out.println();
                System.out.println("ingrese lado 1");
                lado1 = read.nextDouble();
                System.out.println("ingrese lado 2");
                lado2 = read.nextDouble();
                System.out.println("El area es: " + calcularArea(lado1, lado2));
                System.out.println();
                break;
            case 2:
                System.out.println();
                System.out.println("ingrese lado 1");
                lado1 = read.nextDouble();
                System.out.println("ingrese lado 2");
                lado2 = read.nextDouble();
                System.out.println("ingrese lado 3");
                lado3 = read.nextDouble();
                System.out.println("ingrese lado 4");
                lado4 = read.nextDouble();
                System.out.println();
                System.out.println("El perimetro es: " + calcularPerimetroCuadrado(lado1, lado2, lado3, lado4));
                System.out.println();
                break;
            case 3:
                System.out.println();
                System.out.println("Adios");
                System.out.println();
                break;
                
            default:
                System.out.println();
                System.out.println("Opción no válida");
                System.out.println();
        }
    }
    
    //funcion para retornar el valor de un area
    public static double calcularArea(double ladoA,double ladoB){
        return ladoA * ladoB;
    }
    
    //funcion para calcular perimetro
    public static double calcularPerimetroCuadrado(double lado1, double lado2, double lado3, double lado4){
        return lado1 + lado2 + lado3 + lado4;
    }
}
