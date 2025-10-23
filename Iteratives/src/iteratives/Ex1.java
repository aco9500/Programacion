package iteratives;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aco9500
 */
public class Ex1 {
    public static void main(String[] args) {
        int num;
        Scanner in = new Scanner(System.in);
        System.out.println("Introdueix el numero natural: ");
        num = in.nextInt();
        if (num>0) {
            for (int i = 1; i <= num; i++) {
                System.out.printf(i+" ");
            }
            System.out.printf("\b\n");
        } else {
            System.out.println("El numero ha de ser positiu");
        }
    }
}
