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
public class Ex12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double preu,preu_descompte;
        System.out.print("Introdueix preu sense descompte: ");
        preu=in.nextDouble();
        System.out.print("Introdueix preu amb descompte: ");
        preu_descompte=in.nextDouble();
        mostrarDescompte(preu,preu_descompte);
    }
    public static void mostrarDescompte(double x, double y){
         double descompte=((x-y)/x)*100;
         System.out.printf("El porcentatge de descompte es:%.2f %%\n",descompte);
    }
}
