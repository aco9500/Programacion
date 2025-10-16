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
public class Ex4 {
    public static void main(String[] args) {
        //declarem variables
        double num;
        Scanner in=new Scanner(System.in);
        //programa
        System.out.print("Introduexi el num: ");
        num=in.nextDouble();
        if (num>0) {
            System.out.println("Positiu");
        } else {
            if (num<0) {
                System.out.println("Negatiu");
            } else {
                System.out.println("Zero");
            }
        }
    }
}
