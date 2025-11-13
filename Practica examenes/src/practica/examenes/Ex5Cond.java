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
public class Ex5Cond {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1,num2;
        System.out.print("Introduce el num1: ");
        num1=in.nextInt();
        System.out.print("Introduce el num2: ");
        num2=in.nextInt();
        if (num1>num2) {
            System.out.println("El mas grande es: "+num1);
        } else if (num2>num1) {
            System.out.println("El mas grande es: "+num2);
        } else {
            System.out.println("Los numero son iguales");
        }
    }
}
