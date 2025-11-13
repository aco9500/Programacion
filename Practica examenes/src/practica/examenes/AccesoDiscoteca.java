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
public class AccesoDiscoteca {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int edad;
        boolean invitacion;
        System.out.print("Cuantos años tienes?: ");
        edad = in.nextInt();
        System.out.print("Tienes invitacion?: ");
        invitacion = in.nextBoolean();
        if (edad >= 18) {
            System.out.println("Puedes entrar. Eres mayor de edad.");
        } else if (edad >= 16 && invitacion) {
            System.out.println("Puedes entrar con invitación especial.");
        } else if (edad >= 16 && !invitacion) {
            System.out.println("No puedes entrar. Necesitas una invitación.");
        } else {
            System.out.println("No puedes entrar. Eres menor de 16 años.");
        }
    }
}
