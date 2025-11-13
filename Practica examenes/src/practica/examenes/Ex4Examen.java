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
public class Ex4Examen {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num, positivo = 0, negativo = 0;
        do {
            System.out.print("Introduce un num: ");
            num = in.nextInt();
            if (num > 0) {
                positivo++;
            } else if (num < 0) {
                negativo++;
            }
        } while (num != 0);
        System.out.println("Positivos: " + positivo);
        System.out.println("Negativos: " + negativo);
    }
}
