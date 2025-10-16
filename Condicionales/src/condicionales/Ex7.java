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
public class Ex7 {
    public static void main(String[] args) {
        //variables
        double num1,num2,num3;
        Scanner in = new Scanner(System.in);
        //programa
        System.out.print("Introduir el numero: ");
        num1 = in.nextDouble();
        System.out.print("Introduir el numero: ");
        num2 = in.nextDouble();
        System.out.print("Introduir el numer: ");
        num3 = in.nextDouble();
        if (num1==num2&&num1==num3) {
            System.out.println("Son Iguals");
        } else {
            if (num1>num2) {
                if (num1>num3) {
                    System.out.printf("%.2f es mes gran\n",num1);
                } else {
                    System.out.printf("%.2f es mes gran\n",num3);
                }
            } else {
                if (num2>num3) {
                    System.out.printf("%.2f es mes gran\n",num2);
                } else {
                    System.out.printf("%.2f es mes gran\n",num3);
                }
            }
        }
    }
 
}
