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
public class Activitar2 {
    public static void main(String[] args) {
        //declaramos variables
        Scanner in = new Scanner(System.in);
        int bateria,rendiment;
        //comenzamos el programa
        System.out.print("Introdueix el percentatge de bateria: ");
        bateria=in.nextInt();
        System.out.print("Introdueix el rendiment del procesador: ");
        rendiment=in.nextInt();
        //comienzan las condiciones y final del programa
        if (bateria>100 || bateria<0 || rendiment>100 || rendiment<0) {
            System.out.println("Introdueix uns valors correctes");
        } else if (bateria>80 && rendiment>85) {
            System.out.println("Portatil en molt bon estat");
        } else if (bateria<40 || rendiment<50) {
            System.out.println("Portatil en mal estat");
        } else {
            System.out.println("Portatil en estat aceptable");
        }
        in.close();
    }
}
