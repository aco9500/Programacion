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
public class Grados {
    public static void main(String[] args) {
        double temperatura,temperaturafinal;
        Scanner in = new Scanner(System.in);
        System.out.println("Introdueix la temperatura en Farenheit: ");
        temperatura=in.nextDouble();
        temperaturafinal = (temperatura-32)*5/9;
        System.out.printf("La temperatura en Celsius es: %.2f\n",temperaturafinal);
    }
}
