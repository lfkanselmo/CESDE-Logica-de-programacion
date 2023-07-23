/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mis_apuntes;

/**
 *
 * @author 505
 */
public class OperadorComparacion {

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 7;

        boolean resul = num1 >= num2;
        System.out.println(resul);

        String nombre1 = "Maria";
        String nombre2 = "Maria";
        boolean isEqual = nombre1.equals(nombre2);
        System.out.println("¿Los nombres son iguales?: " + isEqual);

        double salario1 = 1160000;
        double salario2 = 1200000;

        boolean comSalarios1 = salario1 != salario2;
        boolean comSalarios2 = salario1 == salario2;
        System.out.println("¿Los salarios son diferentes?: " + comSalarios1);
        System.out.println("¿Los salarios son iguales?: " + comSalarios2);

        int edad = 11;
        if (edad <= 10) {
            System.out.println("Puede ingresar");
        } else {
            System.out.println("No puede entrar");
        }

        //si Pepito tiene menos de 2800 en la civica
        double civicaSaldo = 2900;
        if (civicaSaldo < 2800) {
            System.out.println("Saldo insuficiente");
        } else {
            System.out.println("Saldo: " + (civicaSaldo - 2800));
        }

        //si Juan sacó 2.9 en el examen de logica
        double notaJuan = 2.9;
        if (notaJuan >= 3.0) {
            System.out.println("Ganó");
        } else if (notaJuan >= 2.0 && notaJuan < 3.0) {
            System.out.println("Perdió pero puede recuperar");
        } else {
            System.out.println("Perdió y no puede recuperar, mejor desempeño para la próxima");
        }

        //si Andrés es 3cm más alto que Juan
        int juanAltura = 170;
        int andresAltura = 179;

        if (andresAltura > juanAltura) {
            System.out.println("Andres es " + (andresAltura - juanAltura) + " centrimentros más alto que Juan");

        } else if (andresAltura < juanAltura) {
            System.out.println("Juan es " + (juanAltura - andresAltura) + " centrimentros más alto que Andres");
        } else {
            System.out.println("Tienen la misma altura");
        }

        //si tengo el fin de semana libre
        boolean freeWeekend = false;
        if (freeWeekend) {
            System.out.println("Tiene el fin de semana libre");
        } else {
            System.out.println("Tiene el fin de semana ocupado");
        }

        //si me invitan a una fiesta
        boolean invitacionFiesta = false;

        if (invitacionFiesta) {
            System.out.println("Está invitado a la fiesta");
        } else {
            System.out.println("No ha sido invitado a la fiesta");
        }

        //si quiero helado o quiero pizza 
        boolean quieroPizza = true;
        boolean quieroHelado = false;
    

        if (quieroHelado ) {
            if (quieroPizza) {
                System.out.println("Quiero helado y quiero pizza");
            } else {
                System.out.println("solamente quiero helado");
            }
        } else {
            if (quieroPizza) {
                System.out.println("solamente quiero pizza");
            } else {
                System.out.println("no quiero ni pizza ni helado");
            }
        }
        
        
    }

}
