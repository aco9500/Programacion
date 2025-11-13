/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modular;

import java.util.Scanner;

public class Ex7 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char resposta;

        do {
            System.out.print("Introdueix el preu de l'article: ");
            float preu = in.nextFloat();

            float preuFinal = preuAmbIva(preu);

            System.out.printf("Preu amb IVA: %.2f €\n", preuFinal);

            System.out.print("Vols introduir un altre article? (s/n): ");
            resposta = in.next().toLowerCase().charAt(0);

        } while (resposta == 's');
    }

    private static float preuAmbIva(float preu) {
        return preu * 1.21f; // 21% d’IVA
    }
}
