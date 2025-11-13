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
public class Ex2Seq {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int costat,area;
        System.out.print("Introduce el lado de un cuadrado: ");
        costat = in.nextInt();
        area = costat*costat;
        System.out.println("El area del cuadrado es: "+area);
    }
}
