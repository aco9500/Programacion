/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios1;

import java.util.Scanner;

/**
 *
 * @author aco9500
 */
public class Ex5 {
    public static void main(String[] args) {
        double preu_og,preu_rebaixa,descompte;
        Scanner in = new Scanner(System.in);
        System.out.println("Introdueix el preu nominal d'un article:");
        preu_og=in.nextDouble();
        System.out.println("Introdueix el preu rebaixat d'un article");
        preu_rebaixa=in.nextDouble();
        descompte=100-((preu_rebaixa*100)/preu_og);
        System.out.println("El descompte aplicat a un producte que valia " +preu_og+ 
                " i que ara costa " +preu_rebaixa+ " es de "+descompte);
    }
}
