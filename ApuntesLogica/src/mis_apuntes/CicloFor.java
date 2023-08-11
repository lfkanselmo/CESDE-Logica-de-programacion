/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mis_apuntes;

import java.util.Scanner;

/**
 *
 * @author desarrollo
 */
public class CicloFor {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        int[] nums;

        System.out.println("Ingrese cuántos números desea guardar: ");
        int n = read.nextInt();

       nums = new int[n];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) (Math.random() * 50 + 1);
            
        }
        System.out.println();

        System.out.println("Los números ingresados son: ");

        for (int num : nums) {
            System.out.print(num + " ");
        }

    }
}
