/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen;

import java.util.Scanner;

/**
 *
 * @author aco9500
 */
public class Activitat3 {

    public static void main(String[] args) {
        //declaramos variables
        Scanner in = new Scanner(System.in);
        double vehicles, velocidad;
        //comenzamos el programa
        System.out.print("Introdueix la quantitat de vehicles: ");
        vehicles = in.nextDouble();
        //comienza las condiciones y los bucles
        if (vehicles <= 0) {
            System.out.println("Introdueix un nombre correcte");
        } else {
            for (int i = 1; i <= vehicles; i++) {
                System.out.print("Introdueix la velocitat " + i + ":");
                velocidad = in.nextDouble();
                if (velocidad>120 || velocidad<30) {
                    System.out.println("Atencio, velocitat fora de limits");
                } else {
                }
            }
        }
        //cerramos scanner y acabamos
        in.close();
    }
}
