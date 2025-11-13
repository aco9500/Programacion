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
public class TablaMultBucle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int n = in.nextInt();
        int i=1;
        do {            
            System.out.println(n+" x "+i+" = "+(n*i));
            i++;
        } while (i<=10);
    }
}
