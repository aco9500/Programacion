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
public class Ex3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1,num2;
        System.out.print("Introdueix num1: ");
        num1=in.nextInt();
        System.out.print("Introdueix num2: ");
        num2=in.nextInt();
        int num=menor(num1,num2);
        System.out.printf("El numero mes petit es: %d\n",num);
    }
    private static int menor(int x, int y){
        if (x<y) {
            return x;
        } else {
            return y;
        }
    }
}
