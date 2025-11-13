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
public class Ex2Examen {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double nota;
        System.out.print("Introduce tu nota: ");
        nota = in.nextDouble();
        if (nota<0 || nota>10) {
            System.out.println("Introduce una nota valida");
        } else if (nota<5) {
            System.out.println("Suspenso");
        } else if (nota==5) {
            System.out.println("Aprobado justo");
        } else if (nota<=6) {
            System.out.println("Bien");
        } else if (nota<=8) {
            System.out.println("Notable");
        } else {
            System.out.println("Sobresaliente");
        }
    }
}