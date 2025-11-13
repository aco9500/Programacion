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
public class AccesoAtraccion {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int edad;
        double altura;
        boolean acompañado;
        System.out.print("Cuantos años tienes?: ");
        edad = in.nextInt();
        System.out.print("Cuanto mides?: ");
        altura = in.nextDouble();
        System.out.print("Vas acompañado de un adulto?: ");
        acompañado = in.nextBoolean();
        if ((edad>=12 && altura>1.5) || edad >=10 && acompañado ) {
            System.out.println("Puede entrar");
        }
         else {
            System.out.println("No puede entrar");
        }
    }
}

