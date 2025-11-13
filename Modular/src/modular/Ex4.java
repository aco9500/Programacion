/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modular;

import java.util.Scanner;

/**
 *
 * @author adria
 */
public class Ex4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1;
        System.out.print("Introdueix el num: ");
        num1=in.nextInt();
        int num=obteSigne(num1);
        if (num==0) {
            System.out.println("El nombre es 0");
        } else if (num>0) {
            System.out.println("El nombre es positiu");
        } else {
            System.out.println("El nombre es negatiu");
        }
    }
    private static int obteSigne(int x){
        if (x==0) {
            return 0;
        } else if (x>0) {
            return 1;
        } else {
            return -1;
        }
    }
}
