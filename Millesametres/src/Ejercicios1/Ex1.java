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
public class Ex1 {
    public static void main(String[] args) {
        //declararem las variables
        String nom = new String();
        Scanner entrada = new Scanner(System.in);
        //el programa
        System.out.print(" Introdueix el teu nom: ");
        nom=entrada.nextLine();
        //sortida de programa
        System.out.println(" Hola "+nom);
    }
}
