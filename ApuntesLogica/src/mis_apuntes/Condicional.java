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
public class Condicional {

    static Scanner read = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {

        String mail = "pepito@mail.com";
        int password = 123456;

        System.out.println("Ingrese su email: ");
        String emailUser = read.nextLine();

        System.out.println("Ingrese su contraseña: ");
        int passwordUser = read.nextInt();

        if (mail.equals(emailUser) && password == passwordUser) {
            System.out.println("Sesión iniciada. Bienvenido");
        } else if (mail.equals(emailUser)) {
            System.out.println("Contraseña incorrecta");
        } else {
            System.out.println("Correo ingresado incorrecto");
        }

    }

}
