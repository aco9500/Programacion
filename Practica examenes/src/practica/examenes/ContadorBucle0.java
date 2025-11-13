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
public class ContadorBucle0 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        System.out.print("Cuantas veces quieres ver el mensaje?: ");
        num = in.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.println("Hola Mundo");
        }
    }
}
