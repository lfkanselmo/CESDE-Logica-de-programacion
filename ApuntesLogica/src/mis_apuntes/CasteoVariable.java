/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mis_apuntes;

/**
 *
 * @author 505
 */
public class CasteoVariable {

    public static void main(String[] args) {
        int a = 4, b = 10, suma, resta, multiplicacion;
        float division;

        suma = a + b;
        resta = a - b;
        multiplicacion = a * b;
        division = (float) b/a;
        
        System.out.println("El resultado de la suma es: " + suma);
        System.out.println("El resultado de la resta es: " + resta);
        System.out.println("El resultado de la multiplicación es: " + multiplicacion);
        System.out.println("El resultado de la división es: " + division);

    }

}
