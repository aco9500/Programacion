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
public class Ex6 {
    public static void main(String[] args) {
        double fahrenheit,celsius;
        Scanner in = new Scanner(System.in);
        System.out.println("Introdueix la temperatura en graus Fahrenheit:");
        fahrenheit = in.nextDouble();
        celsius = (fahrenheit-32)/1.8;
        System.out.println("La temperatura de "
        +fahrenheit+" graus Fahrenheit equival a "+celsius+" graus Celsius ");
    }
}
