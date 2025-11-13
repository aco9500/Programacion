/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modular;

import java.util.Scanner;

/**
 *
 * @author aco9500
 */
public class Ex14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double catet1,catet2;
        System.out.print("Introdueix el primer catet: ");
        catet1=in.nextDouble();
        System.out.print("Introdueix el segon catet: ");
        catet2=in.nextDouble();
        double h=hipotenusa(catet1,catet2);
        System.out.printf("La hipotenusa de %.2f i %.2f es : %.2f\n",catet1,catet2,h);
    }

    private static double hipotenusa(double x, double y) {
        double hipotenusa = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        return hipotenusa;
    }
}
