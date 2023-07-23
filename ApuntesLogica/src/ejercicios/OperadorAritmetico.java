/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

 /*  Realizar    

a. sacar el promedio de puntos
b. por sanción perdió 50 puntos los días martes y miércoles.
c. le van a a pagar por cada 50 puntos una bonificación de 10000 los días
    lunes, martes y miércoles. Y de 15000 los jueves y viernes
d. ¿Cuánto dinero recibe por bonificación en total y cuánto dejó de ganar por las sanciones?
e. deberá imprimir un informe


 */
package ejercicios;

/**
 *
 * @author 505
 */
public class OperadorAritmetico {

    public static void main(String[] args) {
        String name = "Pepito";
        int pMonday = 500, pTuesday = 400, pWednesday = 390, pThursday = 510, pFriday = 300;
        //Declarar e inicializar el promedio
        int average = 0;
        //  a.
        average = (pMonday + pTuesday + pWednesday + pThursday + pFriday) / 5;

        //  b.
        int penalty = 50;
        pTuesday -= penalty;                // pTuesday -= 50;
        pWednesday -= penalty;             // pWednesday -= 50;

        //  c.

        int numBonif = 50;
        int boniLMM = 10000;
        int boniJV = 15000;

        int bonif10 = ((pMonday / numBonif) * boniLMM) + ((pTuesday / numBonif) * boniLMM) + ((pWednesday / numBonif) * boniLMM);
        int bonif15 = ((pThursday / numBonif) * boniJV) + ((pFriday / numBonif) * boniJV);

        int bonifTotal = bonif10 + bonif15;
        int lostMoney = boniLMM * 2;          //50 puntos martes y 50 puntos miércoles, deja de percibir 10000 por día

        //  e. Informe
        System.out.println("Buenas tardes... ");
        System.out.println("el usuario " + name + " recibió inicialmente las siguientes cantidades de puntos: ");
        System.out.println("Lunes: 500");
        System.out.println("Martes: 400");
        System.out.println("Miércoles: 390");
        System.out.println("Jueves: 510");
        System.out.println("Viernes: 300");
        System.out.println();
        System.out.println("El promedio de puntos por día es: " + average);
        System.out.println();
        System.out.println("Pierde 50 puntos el día lunes por penalización");
        System.out.println("Pierde 50 puntos el día martes por penalización");
        System.out.println("");
        System.out.println("Nuevo valor de puntos para el  martes: " + pTuesday);
        System.out.println("Nuevo valor de puntos para el  miércoles: " + pWednesday);
        System.out.println("Bonificaciones recibidas los días lunes, martes "
                + "y miércoles: " + bonif10 + " (recibe 10000 por cada 50 puntos)");
        System.out.println("Bonificaciones recibidas los días jueves, viernes "
                + bonif10 + " (recibe 15000 por cada 50 puntos)");

        System.out.println();
        System.out.println("Recibe en total por bonificaciones: " + bonifTotal);
        System.out.println();
        System.out.println("Por concepto de sanciones deja de percibir en bonificaciones: " + lostMoney);

    }

}
