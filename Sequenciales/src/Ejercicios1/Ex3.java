/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios1;

import java.util.Scanner;

/**
 *
 * @author aco9500
 */
public class Ex3 {
    public static void main(String[] args) {
        double num1,num2,suma,resta,multiplicacio,divisio;
        Scanner entrada= new Scanner(System.in);
        System.out.println(" Intodueix el valor de numero 1: ");
        num1=entrada.nextDouble();
        System.out.println(" Introdueix el valor de numero 2: ");
        num2=entrada.nextDouble();
        suma= num1 + num2;
        resta= num1 - num2;
        multiplicacio= num1 * num2;
        divisio= num1 / num2;
         System.out.println(" El resultat de la suma de num1 i num2= "+suma);
         System.out.println(" El resultat de la resta de num1 i num2= "+resta);
         System.out.println(" El resultat de la multiplicacio de num1 i num2= "+multiplicacio);
         System.out.println(" El resultat de la divisio de num1 i num2= "+divisio);
    }
}
