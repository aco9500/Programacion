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
public class Ex6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1,num2;
        System.out.print("Introdueix num1: ");
        num1=in.nextInt();
        System.out.print("Introdueix num2: ");
        num2=in.nextInt();
        int num=compara(num1,num2);
        if (num==0) {
            System.out.println("Son iguals");
        } else if (num>0) {
            System.out.printf("%d es mes gran\n",num1);
        } else {
            System.out.printf("%d es mes gran\n",num2);
        }
    }
    private static int compara(int x,int y){
        if (x==y) {
            return 0;
        } else if (x>y) {
            return +1;
        } else {
            return -1;
        }
    }
}
