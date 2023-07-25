/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mis_apuntes;

import java.util.Scanner;

/**
 *
 * @author 505
 */
public class Switch2 {

    static Scanner read = new Scanner(System.in).useDelimiter("\n");
    static int option;

    public static void main(String[] args) {
        // Queremos crear un menú para seleccionar platos en un restaurante
        // Cree una opción para desayunos, almuerzos, cena, bebidas, snacks y comidas rápidas.

        menuRestaurante();

    }

    public static void menuRestaurante() {
        System.out.println("Bienvenido al restaurante Martica");
        System.out.println("Seleccione que desea ordenar. ingrese el número de la elección: ");
        System.out.println("1. Desayuno");
        System.out.println("2. Almuerzo");
        System.out.println("3. Cena");
        System.out.println("4. Bebida");
        System.out.println("5. Snack");
        System.out.println("6. Comida rapida");

        option = read.nextInt();

        switch (option) {
            case 1:
                menuDesayunos();
                break;
            case 2:
                menuAlmuerzos();
                break;
            case 3:
                menuCenas();
                break;
            case 4:
                menuBebidas();
                break;
            case 5:
                menuSnacks();
                break;
            case 6:
                menuComidaRapida();
                break;

            default:
                System.out.println("La opción ingresada no está disponible");
                break;
        }

    }
    
    
    

    //funcion para el menu de restaurante
    public static void menuComidaRapida() {

        System.out.println("¿Qué comida rapida desea? ");
        System.out.println("1. Salchipapas");
        System.out.println("2. Chorizo");
        System.out.println("3. Hamburguesa");
        System.out.println("4. Pizza");

        option = read.nextInt();

        switch (option) {
            case 1:
                System.out.println("Sale Salchipapas");
                break;
            case 2:
                System.out.println("Sale Chorizo");
                break;
            case 3:
                System.out.println("Sale Hamburguesa");
                break;
            case 4:
                System.out.println("Sale Pizza");
                break;
            default:
                System.out.println("Eleción ingresada no es válida");
                break;
        }

    }
    
    

    //funcion para el menu de bebidas
    public static void menuBebidas() {
        System.out.println("Ingrese la opción de bebida que desea: ");
        System.out.println("1. Té");
        System.out.println("2. Café");
        System.out.println("3. Agua");
        System.out.println("4. Jugo natural");
        System.out.println("5. gaseosa");

        option = read.nextInt();

        switch (option) {
            case 1:
                System.out.println("Sale té");
                break;
            case 2:
                System.out.println("Sale café");
                break;
            case 3:
                System.out.println("Sale agua");
                break;
            case 4:
                menuJugosNaturales();
                break;
            case 5:
                System.out.println("Sale gaseosa");
                break;
            default:
                System.out.println("Elección no válida");
                break;

        }
    }
    
    
    //funcion para el menu de jugos
    public static void menuJugosNaturales(){
        System.out.println("que sabor desea?: ");
        System.out.println("1. fresa");
        System.out.println("2. mango");
        System.out.println("3. maracuyá");
        
        option = read.nextInt();
        
        switch(option){
            case 1:
                System.out.println("Juguito de fresa");
                break;
            case 2:
                System.out.println("Juguito de mango");
                break;
            case 3:
                System.out.println("Juguito de maracuyá");
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }
    }
    
    //funcion para el menu de desayunos
    public static void menuDesayunos(){
        System.out.println("¿Qué desayuno desea?: ");
        System.out.println("1. Arepa con huevo");
        System.out.println("2. Pan con chocolate");
        System.out.println("3. Tazón de frutas");
        
        option = read.nextInt();
        
        switch(option){
            case 1:
                System.out.println("Arepa con huevo");
                break;
            case 2:
                System.out.println("Pan con chocolate");
                break;
            case 3:
                System.out.println("Tazón de frutas");
                break;
            default:
                System.out.println("Opción no válida");
        }
    }
    
    //funcion para el menu de desayunos
    public static void menuAlmuerzos(){
        System.out.println("¿Qué opción de almuerzo desea?: ");
        System.out.println("1. casuela de frijoles");
        System.out.println("2. ajiaco");
        System.out.println("3. tamal");
        
        option = read.nextInt();
        
        switch(option){
            case 1:
                System.out.println("Frijoles saliendo");
                break;
            case 2:
                System.out.println("Ajiaco");
                break;
            case 3:
                System.out.println("Tamal");
                break;
            default:
                System.out.println("Opción no válida");
        }
    }
    
        //funcion para el menu de snacks
    public static void menuSnacks(){
        System.out.println("¿Qué snack deseas?: ");
        System.out.println("1. empanadas");
        System.out.println("2. papas fritas");
        
        option = read.nextInt();
        
        switch(option){
            case 1:
                System.out.println("empanadas");
                break;
            case 2:
                System.out.println("papas fritas");
                break;
            default:
                System.out.println("valor ingresado incorrecto");
                break;
        }
    }
    
    public static void menuCenas(){
        System.out.println("¿Qué desea para cenar?: ");
        System.out.println("1. pastas");
        System.out.println("2. lasaña");
        System.out.println("3. Vacio de res");
        
        option = read.nextInt();
        
        switch(option){
            case 1:
                System.out.println("pastas");
                break;
            case 2:
                System.out.println("lasaña");
                break;
            case 3:
                System.out.println("corte de res");
                break;
            default:
                System.out.println("Opción no válida");
                break;
               
                
        }
    }

}
