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
public class SumaBucle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce un numero n: ");
        int n = in.nextInt();
        int i =1;
        int suma = 0;
        while (i<=n) {            
            suma+=i;
            i++;
        }
        System.out.println("La suma de 1 hasta "+n+" es "+suma);
    }
}
