/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen;

import java.util.Scanner;

/**
 *
 * @author aco9500
 */
public class Activitat1 {
    public static void main(String[] args) {
        //declaramos variables
        double preu,taxes,descompte;
        Scanner in = new Scanner(System.in);
        //comenzamos el programa
        System.out.print("Introdueix el preu del bitllet: ");
        preu=in.nextDouble();
        System.out.print("Introdueix el valor de les taxes(%): ");
        taxes=in.nextDouble();
        System.out.print("Introdueix el valor del descompte(%): ");
        descompte=in.nextDouble();
        //hacemos los calculos
        double preu_taxes=preu*taxes/100;
        double preu_semifinal=preu+preu_taxes;
        double preu_descompte=preu_semifinal*descompte/100;
        double preu_final=preu-preu_descompte+preu_taxes;
        //printamos el resultado final
        System.out.printf("Un bitllet d'avió de %d €, al aplicarli un %d %% de taxes se li suma %d €, i si li apliquem"
                + "un %d %% de descompte, se li descompten %2.f ,i el seu preu final és de %2.f \n",preu,taxes,preu_taxes,descompte,preu_descompte,preu_final);
        in.close();
    } 
}
