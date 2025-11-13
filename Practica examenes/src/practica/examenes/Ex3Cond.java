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
public class Ex3Cond {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        System.out.print("Introduce el numero: ");
        num=in.nextInt();
        if (num>0) {
            System.out.println("Positiu");
        } else if (num<0) {
            System.out.println("Negatiu");
        } else {
            System.out.println("Es 0");
        }
    }
}
