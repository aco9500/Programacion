/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package condicionales;

import java.util.Scanner;

/**
 *
 * @author adria
 */
public class Ex8 {
    public static void main(String[] args) {
        //variable
        double nota;
        Scanner in = new Scanner(System.in);
        //programa
        System.out.print("Entra la teva qualificacio: ");
        nota=in.nextDouble();
        System.out.println("La teva qualificacio es " +nota);
         if (nota >= 0 && nota <= 10) {
            if (nota < 3) {
                System.out.println("Molt deficient");
            } else if (nota < 5) {
                System.out.println("Insuficient");
            } else if (nota < 6) {
                System.out.println("Suficient");
            } else if (nota < 7) {
                System.out.println("Be");
            } else if (nota < 9) {
                System.out.println("Notable");
            } else {
                System.out.println("Excel.lent");
            }
        } else {
            System.out.println("Nota incorrecte");
        }
    }
}
