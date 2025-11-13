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
public class AccesoVIP {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Tienes entrada?: ");
        boolean tieneEntrada = in.nextBoolean();
        System.out.println("Eres famoso?: ");
        boolean eresFamoso = in.nextBoolean();
        System.out.println("Tienes pase VIP?: ");
        boolean paseVIP = in.nextBoolean();
        if (tieneEntrada && (eresFamoso || paseVIP)) {
            System.out.println("Puedes pasar");
        } else {
            System.out.println("No puedes pasar");
        }
    }
}
