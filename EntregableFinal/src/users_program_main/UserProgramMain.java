/*
Crar una funcionalidad que agregue nombre a un arraylist de manera dinamica, 
preguntando se desea agregar un nuevo nombre, ademas debe imprimir el listado de nombres
indicando el nombre # y debe permitir salir de la funcion
 */
package users_program_main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Krausser
 */
public class UserProgramMain {

    static Scanner read = new Scanner(System.in);
    static ArrayList<String[]> names = new ArrayList<>();
    static ArrayList<String[]> users = new ArrayList<>();
    static String[] user;
    static String[] name;
    static boolean exit = true;
    static boolean found = false;
    static String passwordMaster = "1234";
    static String opc;
    static String userIngres;

    public static void main(String[] args) {
        menuUsers();
    }

    //Menu para los usuarios
    private static void menuUsers() {

        exit = true;
        System.out.println("************ MENU DE USUARIOS ************");

        do {
            System.out.println();
            System.out.println("Ingrese el numero de la eleccion deseada");
            System.out.println("1. Iniciar Sesión");
            System.out.println("2. Crear usuario");
            System.out.println("3. Eliminar usuario");
            System.out.println("4. Salir");
            System.out.println();
            opc = read.next();
            read.skip("\n");

            String masterPassword;

            switch (opc) {
                case "1":
                    login();
                    exit = true;
                    break;

                case "2":
                    adminUsers(passwordMaster, "create");
                    exit = true;
                    break;

                case "3":
                    System.out.println("Ingrese la contraseña maestra: ");
                    masterPassword = read.nextLine();
                    adminUsers(masterPassword, "delete");
                    exit = true;
                    break;

                case "4":
                    exit = false;
                    System.out.println("*********** TERMINANDO ************");
                    break;

                default:
                    System.out.println("Opción no valida");
                    System.out.println();
                    break;
            }
        } while (exit);

    }

    //Metodo para administrar los usuarios
    private static void adminUsers(String masPas, String option) {
        if (masPas.equals(passwordMaster)) {

            switch (option) {
                //para crear usuario
                case "create":
                    user = new String[3];
                    exit = true;

                    do {

                        System.out.println("Ingrese usuario nuevo");
                        userIngres = read.nextLine();

                        if (userIngres.equalsIgnoreCase("c")) {
                            System.out.println("Creación cancelada");
                            exit = false;
                            System.out.println();
                        } else {
                            if (!users.isEmpty()) {
                                for (String[] userE : users) {
                                    if (userE[0].equals(userIngres)) {
                                        System.out.println("Usuario ya existe, intente otro nombre de usuario");
                                        System.out.println("Si desea cancelar la creacion de usuario ingrese la letra C al solicitar usuario");
                                        exit = true;
                                        break;
                                    } else {
                                        exit = false;
                                    }
                                }
                            } else {
                                exit = false;
                            }
                        }

                    } while (exit);

                    if (!userIngres.equalsIgnoreCase("c")) {
                        user[0] = userIngres;

                        System.out.println();
                        System.out.println("Ingrese contraseña");
                        user[1] = read.nextLine();

                        System.out.println("");
                        user[2] = userType();

                        users.add(user);

                        System.out.println("Usuario creado con exito");
                    }

                    break;

                case "delete":
                    System.out.println("Ingrese el usuario que desea eliminar");
                    userIngres = read.nextLine();

                    found = false;

                    for (String[] userE : users) {
                        if (userE[0].equals(userIngres)) {
                            found = true;
                            System.out.println("¿Está seguro de eliminar al usuario " + userE[0] + "? Ingrese S si desea eliminarlo");
                            System.out.println("Todos los nombres que fueron creados por el usuario " + userIngres + " serán eliminados también");
                            String answer = read.next();
                            if (answer.equalsIgnoreCase("s")) {

                                //Eliminar todos los nombres que fueron creados por ese usuario
                                Iterator it = names.iterator();

                                while (it.hasNext()) {
                                    String[] aux = (String[]) it.next();
                                    System.out.println(aux[0]);

                                    if (aux[1].equals(userE[0])) {
                                        it.remove();
                                    }
                                }

                                users.remove(userE);

                                System.out.println("Usuario eliminado con exito");
                                break;
                            } else {
                                System.out.println("Usuario no fue eliminado");
                                break;
                            }
                        }
                    }

                    if (!found) {
                        System.out.println("El usuario ingresado no existe");
                    }

                    break;

                default:
                    System.out.println("Opción ingresada no válida");
                    System.out.println();
                    break;

            }

        } else {

        }
    }

    //Metodo tipo de usuario
    private static String userType() {

        String answer = "";
        exit = true;

        do {
            System.out.println();
            System.out.println("Ingrese tipo de usuario");
            System.out.println("1. Administrador");
            System.out.println("2. Regular");
            opc = read.next();
            read.skip("\n");

            switch (opc) {
                case "1":
                    answer = "Administrador";
                    exit = false;
                    break;
                case "2":
                    answer = "Regular";
                    exit = false;
                    break;
                default:
                    System.out.println("Opción no valida");
                    exit = true;
                    break;

            }
        } while (exit);

        return answer;
    }

    //Metodo para iniciar sesion
    private static void login() {

        found = false;

        if (users.isEmpty()) {
            System.out.println("No hay usuarios creados aun");
        } else {

            System.out.println("Usuario: ");
            String userLogin = read.nextLine();

            for (String[] userE : users) {
                if (userE[0].equals(userLogin)) {
                    System.out.println("Contraseña: ");
                    String passLogin = read.nextLine();

                    if (userE[1].equals(passLogin)) {
                        found = true;
                        menu(userE);
                        break;
                    } else {
                        System.out.println("Contraseña incorrecta");
                        found = true;
                    }

                }
            }

            if (!found) {
                System.out.println("Usuario no existe");
                System.out.println();
            }

        }
    }

    //metodo para el menu
    private static void menu(String[] userE) {

        System.out.println("************ BIENVENIDO ************");

        exit = true;

        do {
            System.out.println();
            System.out.println("----------------------- " + userE[0].toUpperCase() + " -----------------------");
            System.out.println();
            System.out.println("Ingrese el numero de la eleccion deseada");
            System.out.println("1. Agregar nombres");
            System.out.println("2. Mostrar nombres");
            System.out.println("3. Eliminar nombre");
            System.out.println("4. Salir");
            System.out.println();
            opc = read.next();
            read.skip("\n");

            switch (opc) {
                case "1":
                    addName(userE[0]);
                    exit = true;
                    break;

                case "2":
                    showNames();
                    exit = true;
                    break;

                case "3":
                    if (userE[2].equals("Administrador")) {
                        deleteName(userE[0]);
                    } else {
                        System.out.println("Solo los usuarios tipo administrador puede eliminar nombres");
                    }

                    exit = true;
                    break;

                case "4":
                    exit = false;
                    System.out.println("*********** CERRANDO SESION ************");
                    break;
                default:
                    System.out.println("Opción no valida");
                    break;
            }
        } while (exit);
    }

    //metodo para agregar nombres
    private static void addName(String userC) {

        exit = true;

        do {

            name = new String[2];
            System.out.println();
            System.out.println("Ingrese nombre: ");
            name[0] = read.nextLine();
            name[1] = userC;
            names.add(name);

            exit = conti();
        } while (exit);

    }

    //metodo para preguntar si desea agregar más nombres
    private static boolean conti() {
        boolean con;
        System.out.println();
        System.out.println("¿Desea agregar otro nombre? S");
        opc = read.next().toUpperCase();
        read.skip("\n");

        switch (opc) {
            case "S":
                con = true;
                break;
            default:
                System.out.println("*********** FIN INGRESO DE NOMBRES ***********");
                con = false;
                break;
        }

        return con;
    }

    //metodo para imprimir los nombres
    private static void showNames() {
        System.out.println();
        int i = 1;
        for (String[] nameLocal : names) {
            System.out.print("[ Nombre " + i + ": " + nameLocal[0] + " -------> ");
            System.out.println("Creador por: " + nameLocal[1] + " ]");
            i++;
        }

    }

    //Metodo para eliminar nombre
    private static void deleteName(String userC) {
        System.out.println();
        System.out.println("Ingrese el nombre que desea eliminar");
        String nameIngres = read.nextLine();
        found = false;
        for (String[] nameE : names) {
            if (nameE[0].equalsIgnoreCase(nameIngres)) {
                found = true;
                if (userC.equals(nameE[1])) {
                    names.remove(nameE);
                    System.out.println();
                    System.out.println("Nombre eliminado con exito");
                    System.out.println();
                    break;
                } else {
                    System.out.println("No puede eliminar este nombre, fue creado por un usuario diferente");
                    System.out.println("Si desea usar los poderes de administrador, ingrese la contraseña maestra");
                    String provi = read.nextLine();
                    if (provi.equals(passwordMaster)) {
                        names.remove(nameE);
                        System.out.println();
                        System.out.println("Nombre eliminado con exito");
                        System.out.println();
                    } else {
                        System.out.println();
                        System.out.println("Contraseña maestra incorrecta. No es posible eliminar el nombre");
                        System.out.println();
                    }
                    break;
                }
            }
        }

        if (!found) {
            System.out.println("Nombre que intenta eliminar no existe");
            System.out.println();
        }
    }

}
