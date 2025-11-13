/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica.examenes;

import java.util.Scanner;

public class Ex7Examen {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inicio, fin;

        // Pedir los dos números al usuario
        System.out.print("Introduce el número de inicio: ");
        inicio = in.nextInt();

        System.out.print("Introduce el número de fin: ");
        fin = in.nextInt();

        // Comprobar que inicio < fin
        if (inicio >= fin) {
            System.out.println("Error: el número de inicio debe ser menor que el de fin.");
        } else {
            System.out.println("Números primos entre " + inicio + " y " + fin + ":");

            // Recorrer desde inicio hasta fin
            for (int i = inicio; i <= fin; i++) {
                if (esPrimo(i)) {
                    System.out.print(i + " ");
                }
            }

            System.out.println(); // salto de línea al final
        }

        in.close();
    }

    // Función auxiliar para saber si un número es primo
    public static boolean esPrimo(int num) {
        if (num <= 1) {
            return false; // no son primos los menores o iguales a 1
        }

        // Comprobamos desde 2 hasta la raíz cuadrada del número
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // si tiene algún divisor, no es primo
            }
        }

        return true; // si no se encontró ningún divisor, es primo
    }
}

