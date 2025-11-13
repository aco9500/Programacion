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
public class Ex6Examen {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int edad;
        System.out.print("Introduce la edad: ");
        edad=in.nextInt();
        if (edad<0) {
            System.out.println("Edad no valida");
        } else if (edad<13) {
            System.out.println("Niño");
        } else if (edad<18) {
            System.out.println("Adolescente");
        } else if (edad<65) {
            System.out.println("Adulto");
        } else {
            System.out.println("Jubilado");
        }
        in.close();
    }
}