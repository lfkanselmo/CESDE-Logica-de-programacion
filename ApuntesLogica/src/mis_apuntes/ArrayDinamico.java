/*
Crar una funcionalidad que agregue nombre a un arraylist de manera dinamica, 
preguntando se desea agregar un nuevo nombre, ademas debe imprimir el listado de nombres
indicando el nombre # y debe permitir salir de la funcion
 */
package mis_apuntes;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Krausser
 */
public class ArrayDinamico {

    static Scanner read = new Scanner(System.in);
    static ArrayList<String> names = new ArrayList<String>();

    public static void main(String[] args) {
        menu();
    }

    //metodo para el menu
    public static void menu() {

        boolean exit = true;

        System.out.println("****** BIENVENIDO ******");
        do {
            System.out.println();
            System.out.println("Ingrese el numero de la eleccion deseada");
            System.out.println("1. Agregar nombres");
            System.out.println("2. Mostrar nombres");
            System.out.println("3. Salir");
            String opc = read.next();
            read.skip("\n");

            switch (opc) {
                case "1":
                    addName();
                    break;

                case "2":
                    showNames();
                    break;

                case "3":
                    exit = false;
                    System.out.println("***** TERMINADO ******");
                    break;
                default:
                    System.out.println("Opción no valida");
                    break;
            }
        } while (exit);
    }

    //metodo para agregar nombres
    public static void addName() {

        boolean contin;

        do {
            System.out.println();
            System.out.println("Ingrese nombre: ");
            names.add(read.nextLine());

            contin = conti();
        } while (contin);

    }

    //metodo para preguntar si desea agregar más nombres
    public static boolean conti() {
        boolean con = false;
        System.out.println();
        System.out.println("¿Desea agregar otro nombre? S");
        String opc = read.next().toUpperCase();
        read.skip("\n");

        switch (opc) {
            case "S":
                con = true;
                break;
            default:
                System.out.println("***** FIN INGRESO DE NOMBRES *****");
                con = false;
                break;
        }

        return con;
    }

    //metodo para imprimir los nombres
    public static void showNames() {
        for (int i = 0; i < names.size(); i++) {
            System.out.println("Nombre " + (i + 1) + " es: " + names.get(i));
        }
    }
}
