/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iteratives;

import java.util.Scanner;

/**
 *
 * @author aco9500
 */
public class Ex8 {
    public static void main(String[] args) {
        int num;
        Scanner in = new Scanner(System.in);
        do {            
            System.out.println("Introdueix un nombre: ");
            num=in.nextInt();
            if (num <=0) {
                System.out.println("Error: el nombre ha de ser positiu!");
            }
        } while (num<=0);
        int suma = 0;
        long prod = 1;
        for (int i = 1; i <= num; i++) {
            suma+=i;
            prod*=i;
        }
        System.out.println("La suma dels primers " + num + " nombres naturals és: " + suma);
        System.out.println("El producte dels primers " + num + " nombres naturals és: " + prod);
    }
}
