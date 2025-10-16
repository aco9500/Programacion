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
public class Ex6 {
    public static void main(String[] args) {
        //variable
        double num1,num2;
        Scanner in = new Scanner(System.in);
        //programa
        System.out.print("Introduir el numero: ");
        num1 = in.nextDouble();
        System.out.print("Introduir el numero: ");
        num2 = in.nextDouble();
        if (num1>num2) {
            System.out.printf("El numero mes gran es %.2f\n",num1);
        } else {
            if (num1<num2) {
                System.out.printf("El numero mes gran es %.2f\n",num2);
            } else {
                System.out.println("El dos numeros son iguals.");
            }
        }
    }
}
