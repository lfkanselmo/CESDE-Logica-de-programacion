/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author Krausser
 */
public class Calculadora {

    static Scanner read = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {

        inicioSesion();
    }

    //Metodo para el menú
    public static void menu() {

        int opcion, num1 = 0, num2 = 0;

        System.out.println("");
        System.out.println("Seleccione operación deseada");
        System.out.println("1. suma");
        System.out.println("2. resta");
        System.out.println("3. multiplicación");
        System.out.println("4. división");
        System.out.println("5. potencia");
        System.out.println("6. raiz cuadrada");
        System.out.println("7. salir");
        System.out.println("");

        System.out.println("Elija una opción: ");
        opcion = read.nextInt();
        System.out.println("");

        if (opcion > 0 && opcion <= 5) {
            if (opcion == 5) {
                System.out.println("Ingrese la base de la potencia: ");
                num1 = read.nextInt();
                System.out.println("");
                System.out.println("Ingrese el exponente de la potencia: ");
                num2 = read.nextInt();
                System.out.println("");
            } else {
                System.out.println("Ingrese número 1: ");
                num1 = read.nextInt();
                System.out.println("");
                System.out.println("Ingrese número 2: ");
                num2 = read.nextInt();
                System.out.println("");
            }
        }

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
                potencia(num1, num2);
                break;
            case 6:
                raizCuadrada();
                break;
            case 7:
                System.out.println("Adiós");
                break;
            default:
                System.out.println("Opción no valida");
                break;
        }
    }

    //Metodo para iniciar sesión
    public static void inicioSesion() {
        String user = "admin";
        String password = "123456";

        System.out.println("********** INICIAR SESION **********");
        System.out.println("Ingrese usuario: ");
        String usuario = read.nextLine();
        System.out.println("");
        System.out.println("Ingrese contraseña: ");
        String contrasenha = read.nextLine();
        System.out.println("");

        if (user.equals(usuario)) {
            if (password.equals(contrasenha)) {
                System.out.println("********** Bievenido! **********");
                System.out.println("");
                menu();
            } else {
                System.out.println("Contraseña incorrecta...");
            }
        } else {
            System.out.println("Error en las credenciales, usuario ingresado no existe."
                    + " Acceso a la calculadora denegado!");
        }

    }

    //Función para sumar
    public static void sumar(int num1, int num2) {
        System.out.println("");
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        System.out.println("");
    }

    //Función para restar
    public static void restar(int num1, int num2) {
        System.out.println("");
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        System.out.println("");
    }

    //Función para multiplicar
    public static void multi(int num1, int num2) {
        System.out.println("");
        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
        System.out.println("");
    }

    //Función para dividir
    public static void divi(int num1, int num2) {
        double div;

        div = ((double) (num1) / (double) (num2));
        System.out.println(num1 + " / " + num2 + " = " + div);
        if (num2 == 0) {
            System.out.println("");
            System.out.println("No se puede dividir entre cero. Resultado indeterminado");
        }
        System.out.println("");

    }

    //Metodo para calcular la raiz cuadrada
    private static void raizCuadrada() {

        System.out.println("Ingrese el número al que le quiere sacar raiz cuadrada");
        int num1 = read.nextInt();

        int conta = 1;
        int resul;

        int sqr = 0;

        boolean exit = false;

        while (exit == false && conta < num1) {
            resul = num1 / conta;

            if (resul == conta) {
                sqr = resul;
                exit = true;
            } else {
                sqr = 0;
                conta++;
                exit = false;
            }
        }

        if (sqr != 0) {
            System.out.println("raiz encontrada. Es igual a: " + sqr);
        } else {
            System.out.println("El número " + num1 + " no tiene raiz cuadrada exacta");
        }
    }
    
    //Metodo para calcular la potencia de un número
    private static void potencia(int num1, int num2){
        int conta = 1;
        int result = 1;
        
        while (conta <= num2) {            
            result = result * num1;  //result *= num1;
            conta = conta + 1;  //conta++;
        }
        
        System.out.println("El resultado es: " + result);
    }

}
