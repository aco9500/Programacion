/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica.examenes;

import java.util.Scanner;

/**
 *
 * @author adria
 */
public class Ex1Examen {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double num1,num2,resta,suma,div,mult;
        System.out.print("Introduce num1: ");
        num1 = in.nextDouble();
        System.out.print("Introduce num2: ");
        num2 = in.nextDouble();
        suma=num1+num2;
        resta=num1-num2;
        mult=num1*num2;
        div=num1/num2;
        System.out.println("La suma de los dos numero es "+suma);
        System.out.println("La resta de los dos numeros es "+resta);
        System.out.println("La multiplicacion de los dos numeros es "+mult);
        System.out.println("La division de los dos numeros es "+div);
    }
}
