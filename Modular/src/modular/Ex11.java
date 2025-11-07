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
public class Ex11 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.print("Introdueix un num: ");
        int num = in.nextInt();
        mostrarTaulaMultiplicacio(num);
    }
    private static void mostrarTaulaMultiplicacio(int n){
        System.out.println("Taula de multiplicar del "+n+":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(n+" x "+i+" = "+(n*i));
        }
    }
}
