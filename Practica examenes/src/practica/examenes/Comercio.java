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
public class Comercio {
    public static void main(String[] args) {
        double preu,preu_total;
        int cantidad;
        Scanner in = new Scanner(System.in);
        System.out.print("Introdueix el preu: ");
        preu=in.nextDouble();
        System.out.print("Introdueix la cantidad: ");
        cantidad=in.nextInt();
        preu_total= preu*cantidad;
        double descuento = 0;
        if (cantidad>10) {
            descuento = preu_total*0.2;
        } else if (cantidad>=5 && cantidad<=10 ) {
            descuento = preu_total*0.1;
        } else {
            descuento = 0;
        }
        double preu_final=preu_total-descuento;
          System.out.printf("Preu final a pagar: %.2f\n",preu_final);      
    }
}
