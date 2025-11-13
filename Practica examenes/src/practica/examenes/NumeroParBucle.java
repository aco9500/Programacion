/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica.examenes;

import java.util.Scanner;

/**
 *
 * @author adria
 */
public class NumeroParBucle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int pares = 0, impares=0;
        for (int i = 1; i < 10; i++) {
            System.out.println("Introduce el numero "+i+": ");
            int num=in.nextInt();
            if (num%2==0) {
                pares++;
            } else {
                impares++;
            }
            System.out.println("Pares: " +pares);
            System.out.println("Impares: " +impares);
        }
    }
}
