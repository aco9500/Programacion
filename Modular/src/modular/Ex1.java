/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modular;

import java.util.Scanner;

/**
 *
 * @author adria
 */
public class Ex1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double num1,num2;
        System.out.print("Introdueix num1: ");
        num1=in.nextDouble();
        System.out.print("Introdueix num2: ");
        num2=in.nextDouble();
        double prod=producte(num1,num2);
        System.out.printf("El producte de %.2f x %.2f es: %.2f\n",num1,num2,prod);
    }
    private static double producte(double x,double y){
        double producte = x*y;
        return producte;
    }
}
