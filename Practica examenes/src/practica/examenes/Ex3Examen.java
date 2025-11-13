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
public class Ex3Examen {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num, tabla;
        System.out.print("Introduce un num: ");
        num = in.nextInt();
        if (num > 10 || num < 0) {
            System.out.println("Introduce un numero del 1 al 10");
        } else {
            for (int i = 0; i <= 10; i++) {
                tabla = num * i;
                System.out.println(i + " x " + num + " : " + tabla);
            }
        }
    }
}
