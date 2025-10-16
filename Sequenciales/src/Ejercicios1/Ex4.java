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
public class Ex4 {
    public static void main(String[] args) {
        double radi,perimetre,area,volum;
        final double PI = 3.14;
        Scanner entrada= new Scanner(System.in);
        System.out.println(" Introdueix el valor del radi: " );
        radi = entrada.nextDouble();
        perimetre =radi * 2 * PI;
        area = PI * radi * radi;
        volum = (4/3)*PI*radi*radi*radi;
        System.out.println(" Amb un radi de: "+radi);
        System.out.println(" La longitud de la circumferencia es: "+perimetre);
        System.out.println(" L'area del cercle es: "+area);
        System.out.println(" El volum de l'esfera es: "+volum);
    }
}