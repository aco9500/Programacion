/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package condicionales;

import java.util.Scanner;

/**
 *
 * @author aco9500
 */
public class Ex3 {
    public static void main(String[] args) {
        //declarem variables
        double num1,num2;
        Scanner in = new Scanner(System.in);
        //programa
        System.out.print("Introdueix el primer valor: ");
        num1=in.nextDouble();
        System.out.print("Introdueix el segon valor: ");
        num2=in.nextDouble();
        if (num1>num2) {
            System.out.printf("%.2f es mas grande\n",num1);
        } else {
            System.out.printf("%.2f es mas grande\n",num2);
        }
    }
}
