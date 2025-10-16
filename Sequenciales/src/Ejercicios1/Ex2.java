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
public class Ex2 {
    public static void main(String[] args) {
        double costat,area;
        Scanner entrada = new Scanner(System.in);
        System.out.println(" Introdueix el costat: ");
        costat = entrada.nextDouble();
        area = costat * costat;
        System.out.println("El area es: "+area);
    }
}
