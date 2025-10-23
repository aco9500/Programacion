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
public class Ex2 {
    public static void main(String[] args) {
        int num,print=2;
        Scanner in = new Scanner(System.in);
        System.out.println("Introdueix un numero natural: ");
        num = in.nextInt();
            while (print<num) {                
                System.out.print(print+" ");
                print+=2;
            }
            System.out.printf("\b\n");
    }
}
