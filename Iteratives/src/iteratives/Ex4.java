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
public class Ex4 {
    public static void main(String[] args) {
        int num,result=1;
        Scanner in = new Scanner(System.in);
        System.out.print("introdueix un nombre: ");
        num = in.nextInt();
        System.out.print(num+"!=");
        for (int i = num; i > 0; i--) {
            result*=i;
            System.out.print(i+"*");
        }
        System.out.println("\b\n");
        System.out.printf("El factorial de %d es %d\n",num,result);
    }
}