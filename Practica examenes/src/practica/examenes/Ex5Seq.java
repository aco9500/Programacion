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
public class Ex5Seq {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double preu_rebaixa,preu_real,preu_descompte;
        System.out.print("Introduce el precio nominal de venta: ");
        preu_real=in.nextDouble();
        System.out.print("Introduce el precio rebajado: ");
        preu_rebaixa=in.nextDouble();
        preu_descompte=100-((preu_rebaixa*100)/preu_real);
        System.out.println("El porcentaje de descuento es del: "+preu_descompte+"% ");
    }
}
