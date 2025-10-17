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
public class Ex11 {
    public static void main(String[] args) {
        //variables
        double preu_prod;
        double diners;
        Scanner in=new Scanner (System.in);
        //programa
        System.out.println("Introdueix el preu del producte: ");
        preu_prod=in.nextDouble();
        System.out.println("Introdueix els diners pagats: ");
        diners=in.nextDouble();
        if (diners>preu_prod) {
            double diners_sob = diners-preu_prod;
            System.out.printf("Sobren %.2f\n",diners_sob);
        } else if (diners<preu_prod) {
            double diners_falt = preu_prod - diners;
            System.out.printf("Falten %.2f\n",diners_falt);
        } else {
            System.out.println("Has pagat exacte");
        }
{
        }
    }
}
