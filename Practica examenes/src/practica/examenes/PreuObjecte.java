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
public class PreuObjecte {
    public static void main(String[] args) {
        double preu_nominal,preu_real,preu_descompte;
        Scanner in = new Scanner(System.in);
        System.out.println("Introdueix preu nominal: ");
        preu_nominal=in.nextDouble();
        System.out.println("Introdueix preu real: ");
        preu_real=in.nextDouble();
        preu_descompte=((preu_nominal - preu_real) / preu_nominal) * 100;
        System.out.printf("Descompte realitzat: %.2f %%\n",preu_descompte);
    }
}
