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
public class Ex3 {
    public static void main(String[] args) {
         int num;
        Scanner in = new Scanner(System.in);
        System.out.print("Introdueix un numero natural: ");
        num = in.nextInt();
        for (int i = 2; i < num; i++) {
            if (i%2==0) {
                System.out.print(i+" ");
            }
        }
        System.out.printf("\b\n");
    }
    }
