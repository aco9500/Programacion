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
public class Ex2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int edad;
        System.out.print("Introduce tu edad: ");
        edad = in.nextInt();
        if (edad<18) {
            System.out.println("Eres menor de edad");
        } else if (edad<65) {
            System.out.println("Eres mayor de edad");
        } else {  
            System.out.println("Eres jubilado");
        }
    }
}
