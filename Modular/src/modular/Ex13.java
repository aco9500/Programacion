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
public class Ex13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char caracter;
        int linia;
        System.out.print("Introdueix un caracter: ");
        caracter=in.next().charAt(0);
        System.out.print("Introdueix un nombre de  linieas: ");
        linia=in.nextInt();
        imprimirTriangle(caracter,linia);
    }

    private static void imprimirTriangle(char n, int m) {
        for (int i = 1; i <= m ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(n);
            }
            System.out.println();
        }
    }
}
