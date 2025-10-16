/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package condicionales;

import java.util.Scanner;

/**
 *
 * @author aco9500
 */
public class Ex2 {
    public static void main(String[] args) {
        //declarem variables
        double num1,num2,suma,resta,mult,div;
        Scanner in = new Scanner(System.in);
        //programa
        System.out.print("Introdueix el primer numero: ");
        num1 = in.nextDouble();
        System.out.print("Introdueix el segon numero: ");
        num2 = in.nextDouble();
        suma = num1+num2;
        System.out.printf("%.2f+%.2f=%.2f\n",num1,num2,suma);
        resta = num1-num2;
        System.out.printf("%.2f-%.2f=%.2f\n",num1,num2,resta);
        mult=num1*num2;
        System.out.printf("%.2f*%.2f=%.2f\n",num1,num2,mult);
        if (num2==0){
            System.out.printf("La divisio per 0 no es posible");
        }else{
            div=num1/num2;
            System.out.printf("%.2f/%.2f=%.2f\n",num1,num2,div);
        }
    }
}
