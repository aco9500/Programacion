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
public class SumaNumsPositivosBucle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        int suma = 0; // acumulador

        do {
            System.out.print("Introduce un número: ");
            numero = sc.nextInt();

            if (numero >= 0) {
                suma += numero; // se suma solo si es positivo o cero
            }

        } while (numero >= 0); // mientras el número no sea negativo

        System.out.println("La suma de los números positivos es: " + suma);
        sc.close();
    }
}

