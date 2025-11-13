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
public class NumPrimoBucle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int n=in.nextInt();
        boolean esprimo= true;
        if (n<=1) {
            esprimo=false;
        } else {
            for (int i = 2; i <= n / 2; i++) {
                if (n%i==0) {
                    esprimo=false;
                    break;
                }
            }
        }
        if (esprimo) {
            System.out.println(n+" es primo");
        } else {
            System.out.println(n+" no es primo");
        }
    }
}
