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
public class Usuario {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Tienes entrada?: ");
        boolean tienesEntrada=in.nextBoolean();
        System.out.println("Estas acompañado?: ");
        boolean estasAcompañado=in.nextBoolean();
        if (tienesEntrada && estasAcompañado) {
            System.out.println("Puedes entrar");
        } else {
            System.out.println("No puedes entrar");
        }
    }
}
