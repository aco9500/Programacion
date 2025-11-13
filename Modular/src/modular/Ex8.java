/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modular;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num1, num2;
        System.out.print("Introdueix num1: ");
        num1 = in.nextInt();
        System.out.print("Introdueix num2: ");
        num2 = in.nextInt();

        // Assegurem que m <= n
        int m = Math.min(num1, num2);
        int n = Math.max(num1, num2);

        int suma = sumatori(m, n);
        System.out.printf("El sumatori de %d a %d = %d\n", m, n, suma);

        int producte = productori(m, n);
        System.out.printf("El productori de %d a %d = %d\n", m, n, producte);
    }

    private static int sumatori(int m, int n) {
        int suma = 0;
        for (int i = m; i <= n; i++) {
            suma += i;
        }
        return suma;
    }

    private static int productori(int m, int n) {
        int prod = 1;
        for (int i = m; i <= n; i++) {
            prod *= i;
        }
        return prod;
    }
}
