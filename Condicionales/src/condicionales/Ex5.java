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
public class Ex5 {
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
            System.out.printf("La forma ascendet es %d - %d\n",num2,num1);
        } else {
            if (num1==num2) {
                System.out.println("No es pot ordenar perque son el mateix numero");
            } else { 
                System.out.printf("La forma ascendet es %d - %d\n",num1,num2);
            }
        }
    }
}
