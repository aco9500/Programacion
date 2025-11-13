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
public class Ex6Seq {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double graus,celsius;
        System.out.print("Introduce los grados: ");
        graus=in.nextDouble();
        celsius=(graus-32)*5/9;
        System.out.println(graus+" Farenheit son "+celsius+" Celsius");
    }
}
