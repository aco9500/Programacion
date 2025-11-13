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
public class Ex2Cond {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double num1,num2;
        System.out.print("Introduce num1: ");
        num1=in.nextDouble();
        System.out.print("Introduce num2: ");
        num2=in.nextDouble();
        if (num1>num2) {
            System.out.println("El numero mes gran es: "+num1);
        } else {
            System.out.println("El numero mes gran es: "+num2);
        }
    }
}
