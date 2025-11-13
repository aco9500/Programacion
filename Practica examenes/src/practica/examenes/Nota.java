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
public class Nota {
    public static void main(String[] args) {
        double nota1,nota2,nota3,notamedia;
        Scanner in=new Scanner(System.in);
        System.out.println("Introduce la primera nota: ");
        nota1 = in.nextDouble();
        System.out.println("Introduce la segunda nota: ");
        nota2 = in.nextDouble();
        System.out.println("Introduce la tercera nota: ");
        nota3 = in.nextDouble();
        
        notamedia= (nota1 + nota2+ nota3) / 3;
        if (notamedia<5) {
            System.out.println("Suspendido");
        } else if (notamedia>=5 && notamedia<=6.9) {
            System.out.println("Aprobado");
        } else if (notamedia>=7 && notamedia<=8.9) {
            System.out.println("Notable");
        } else {
            System.out.println("Sobresaliente");
        }
    }
}
