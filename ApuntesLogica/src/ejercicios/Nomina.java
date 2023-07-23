/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

/**
 *
 * @author 505
 */
public class Nomina {

    public static void main(String[] args) {
        double salarioBasico, prestamoCuota, auxilioTransporte, saludCuota, pensionCuota, salarioFinal;

        salarioBasico = 1250000;
        prestamoCuota = 160000;
        auxilioTransporte = 140606;
        
        float descuento = 0.04f;

        saludCuota = salarioBasico * descuento;
        pensionCuota = salarioBasico * descuento;

        salarioFinal = salarioBasico - prestamoCuota - saludCuota - pensionCuota + auxilioTransporte;

        System.out.println("Pepito cuenta con salario básico de: " + salarioBasico + " pesos");
        System.out.println("Se le descuenta por pensión: " + pensionCuota + " pesos");
        System.out.println("Se le descuenta por salud: " + saludCuota + " pesos");
        System.out.println("Paga cuota de préstamo por: " + prestamoCuota + " pesos");
        System.out.println("Recibe por auxilio de transporte: " + auxilioTransporte + " pesos");
        System.out.println("El salario final que recibe pepito es: " + salarioFinal + " pesos");

    }

}
