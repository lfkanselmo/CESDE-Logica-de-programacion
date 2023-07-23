/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

/**
 * @author 505
 */
public class IfElse {
    public static void main(String[] args) {
        //validar si una persona es mayor de edad, puede ingresar sino no puede
        int edadPersona = 19;

        if (edadPersona >= 18) {
            System.out.println("Es mayor de edad. Puede entrar");
        } else {
            System.out.println("Lo siento, no puede entrar. La edad minima debe ser de 18 años");
        }

        //validar si una persona gana menos de 2 smmlv se le paga auxilio de trasporte sino, se le paga el salario convenido
        double salarioMinimo = 1160000;
        double salarioPersona = 1250000;
        double auxilioTransporte = 140606;

        if (salarioPersona < (salarioMinimo * 2)) {
            System.out.println("El salario final es: " + (salarioPersona + auxilioTransporte) + ". Se le está pagando el auxilio de transporte");
        } else {
            System.out.println("El salario final es: " + salarioPersona + ". NO se le está pagando el auxilio de transporte");
        }
        // int num1 = 30; int num2 = 32; validar si el número 1 e menor que el número 2 y cual es la diferencia
        int num1 = 30;
        int num2 = 32;

        if (num1 < num2) {
            System.out.println("El número 1 es menor que el número 2 y su diferencia es de: " + (num2 - num1));
        }
        //validar si num1 es igual a num2
        if (num1 == num2){
            System.out.println("los números son iguales");
        }
        //validar si num1 es diferente de num2
        if (num1 != num2){
            System.out.println("los números son diferentes");
        }
        //validar si num2 es mayor que num1 y cual es la diferencia
        if (num1 < num2) {
            System.out.println("El número 2 es mayor que el número 1 y su diferencia es de: " + (num2 - num1));
        }
        //castear num1 y num2 y realizar una division, una multiplicacion, una suma y una resta
        //suma
        System.out.println("Suma " + num1 + " + " + num2 + " = " + (num1 + num2));
        //resta
        System.out.println("Resta " + num1 + " - " + num2 + " = " + (num1 - num2));
        //multiplicacion
        System.out.println("Multiplicación " + num1 + " * " + num2 + " = " + (num1 * num2));
        //División
        System.out.println("División " + num1 + " / " + num2 + " = " + ((double)(num1) / (double) (num2)));
        //realizar siguiente operacion num1 % num2, explicar el resultado
        System.out.println("El modulo de " + num1 + " % " + num2 + " es: " + (num1%num2));
        System.out.println("El modulo es lo que sobra de hacer la división del primer número en el segundo número");
    }
}
