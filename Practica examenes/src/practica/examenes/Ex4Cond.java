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
public class Ex4Cond {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1,num2;
        System.out.print("Introduce num1: ");
        num1=in.nextInt();
        System.out.print("Introduce num2: ");
        num2=in.nextInt();
        if (num1>num2) {
            System.out.printf("El orden ascendente es:\n%d\n%d\n",num1,num2);
        } else if (num1<num2) {
            System.out.printf("El orden ascendente es:\n%d\n%d\n",num2,num1);
        } else {
        }
    }
}
