/*
Los siguientes son los datos de 3  jugadores de futbol: Jugador 1, Juan, “15 años”, delantero. 
Jugador 2: Pedro, “16 años” , defensa. Jugador 3: Luis , “17 años”, arquero. 
Cree una loop que imprima la información de los jugadores.​
 */
package examen;

/**
 *
 * @author Krausser
 */
public class Punto3 {

    public static void main(String[] args) {

        String[][] jugadores = {{"Juan", "15 años", "delantero"},
        {"Pedro", "16 años", "defensa"},
        {"Luis", "17 años", "arquero"}};
        
        int n = 0, m = 0, p = 0, q = 0;

        for (int i = 0; i < jugadores.length; i++) {
            System.out.println("Jugador " + (i + 1) + ": ");
            for (int j = 0; j < jugadores[i].length; j++) {
                String atributo;
                if (j == 0) {
                    atributo = "Nombre: ";
                } else if (j == 1) {
                    atributo = "Edad: ";
                    
                    if(jugadores[i][j].equals("16 años")){
                        p = i;
                        q = j;
                    }

                } else {
                    atributo = "Posición: ";
                    if (jugadores[i][j].equals("arquero")) {
                        n = i;
                        m = j;
                    }
                }
                
                System.out.println(atributo + jugadores[i][j]);
                
            }
            System.out.println("");
        }
        
        System.out.println("Posicion de arquero en: " + "[" + n + "] , [" + m + "] ");
        System.out.println("Posicion de con edad de 16 años en: " + "[" + p + "] , [" + q + "] ");

    }
}
