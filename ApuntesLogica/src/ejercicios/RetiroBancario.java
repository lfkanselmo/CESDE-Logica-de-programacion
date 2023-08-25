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
public class RetiroBancario {

    static private double saldo = 200000.0;
    static private Scanner read = new Scanner(System.in);
    static private boolean stay;

    public static void main(String[] args) {
        iniciarSesion();
    }

    //Metodo para iniciar sesion
    private static void iniciarSesion() {
        String nCuenta = "92101068686";
        String contrasenha = "9210";
        String accountNumber;
        String password;
        boolean cancelacion = false;

        int intentos = 3;
        stay = true;

        do {

            
            System.out.println("Ingrese numero de cuenta: ");
            accountNumber = read.nextLine();
            System.out.println("Ingrese la contraseña de cuenta: ");
            password = read.nextLine();

            if (accountNumber.equals(nCuenta) && password.equals(contrasenha)) {
                iniciarCajero();
                break;
            } else if (accountNumber.equals(nCuenta)) {
                System.out.println("Contraseña incorrecta...");
                intentos--;
                System.out.println("Intentos restantes " + intentos);
                cancelacion = cancelar();
            } else {
                System.out.println("Cuenta bancaria ingresada no existe. Intente de nuevo");
                cancelacion = cancelar();
            }

            if (cancelacion) {
                System.out.println();
                System.out.println("Inicio de sesión cancelado ");
                System.out.println("******* FINALIZADO ********");
                stay = false;
            } else{
                stay = true;
            }

        } while (stay && intentos > 0);

    }

    //Metodo para iniciar el cajero
    private static void iniciarCajero() {
        String seleccion;
        stay = true;

        System.out.println();
        System.out.println("******** BIENVENIDO ********");
        System.out.println();

        do {
            System.out.println("Seleccione la operación a realizar: ");
            System.out.println("1. Retirar");
            System.out.println("2. Depositar");
            System.out.println("3. Consultar saldo");
            System.out.println("4. Salir");
            seleccion = read.next();

            switch (seleccion) {
                case "1":
                    retirar();
                    break;
                case "2":
                    depositar();
                    stay = true;
                    break;

                case "3":
                    consultarSaldo();
                    stay = true;
                    break;

                case "4":
                    System.out.println("******** SESION TERMINADA ********");
                    stay = false;
                    break;

                default:
                    System.out.println("Opción ingresada no válida. Intente de nuevo");
                    stay = true;
                    break;
            }
        } while (stay);

    }

    //Función para retirar
    private static void retirar() {
        stay = true;
        double money;
        int canRetiros = 5;
        do {
            System.out.println("¿Cuanto dinero desea retirar?");
            money = read.nextDouble();
            read.skip("\n");

            if (money <= 50000 && money <= saldo) {
                retiro(money);
                canRetiros--;

                boolean exitOpc = true;

                do {
                    System.out.println("¿Desea realizar otro retiro? S/N");
                    String opc = read.next().toUpperCase();

                    switch (opc) {
                        case "S":
                            System.out.println("Máximo 5 retiros por día... Puede realizar " + canRetiros + " retiros más");
                            stay = true;
                            exitOpc = false;
                            break;
                        case "N":
                            stay = false;
                            exitOpc = false;
                            System.out.println("Fin programa");
                            break;
                        default:
                            System.out.println("Opción elegida invalida");
                            exitOpc = true;
                            break;
                    }
                } while (exitOpc);

            } else {
                if (money > 50000) {
                    System.out.println("Tope máximo de retiro es 50.000");
                    stay = true;
                } else {
                    System.out.println("No hay saldo suficiente. Se retirará el saldo disponible");
                    retiro(saldo);
                    stay = false;
                    System.out.println("fin programa");
                }
            }

        } while (stay && canRetiros > 0);
    }

    //función para depositar
    private static void depositar() {
        System.out.println("¿Cuánto dinero desea depositar?");
        double money = read.nextDouble();
        saldo += money;
        System.out.println("Se agregó: " + money);
        System.out.println("Nuevo saldo: " + saldo);
        System.out.println();
    }

    //función para realizar retiros
    private static void retiro(double money) {
        saldo -= money;
        System.out.println();
        System.out.println("Se retira: " + money);
        System.out.println("Nuevo saldo disponible: " + saldo);
        System.out.println();
    }

    //función para consultar el saldo
    private static void consultarSaldo() {
        System.out.println("El saldo actual es: " + saldo);
        System.out.println();
    }

    //metodo para cancelar inicio de sesion
    private static boolean cancelar() {
        stay = true;
        boolean respuesta = false;

        do {
            System.out.println("¿Cancelar inicio de sesion? S/N");
            String can = read.next().toUpperCase();
            read.skip("\n");
            switch (can) {
                case "S":
                    respuesta = true;
                    stay = false;
                    break;
                case "N":
                    respuesta = false;
                    stay = false;
                    break;
                default:
                    System.out.println("Ingrese S o N");
                    System.out.println();
                    stay = true;
                    break;
            }
        } while (stay);

        return respuesta;
    }
}
