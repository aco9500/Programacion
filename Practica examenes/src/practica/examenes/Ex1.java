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
public class Ex1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1,num2,suma,resta,mult,div;
        System.out.print("Introduce num1: ");
        num1 = in.nextInt();
        System.out.print("Introduce num2: ");
        num2 = in.nextInt();
        suma = num1+num2;
        resta=num1-num2;
        mult=num1*num2;
        div=num1/num2;
        System.out.println("La suma de los dos numeros es: "+suma);
        System.out.println("La resta de los dos numeros es: "+resta);
        System.out.println("La multiplicacion de los dos numeros es: "+mult);
        System.out.println("La division de los dos numeros es: "+div);
    }
}
