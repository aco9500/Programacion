/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package condicionales;

import java.util.Scanner;

/**
 *
 * @author aco9500
 */
public class Ex12 {
    public static void main(String[] args) {
        //variable
        String color;
        Scanner in=new Scanner(System.in);
        //programa
        System.out.print("Introdueix el valor del color: ");
        color=in.nextLine();
        switch (color) {
            case "vermell":
                System.out.println("Esperar");
                break;
            case "groc":
                System.out.println("Correr");
                break;
            case "verd":
                System.out.println("Passar");
                break;
            default:
                System.out.println("Color Incorrecte");
        }
    }
}
