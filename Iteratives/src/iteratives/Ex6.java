/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iteratives;

import java.util.Scanner;

/**
 *
 * @author aco9500
 */
public class Ex6 {

    public static void main(String[] args) {
        int num, positivo = 0, negativo = 0, N;
        Scanner in = new Scanner(System.in);
        System.out.println("Cuantos nums quieres pedir?: ");
        N=in.nextInt();
        for (int i = 1; i < 5; i++) {
            System.out.println("Introdueix un numero: ");
            num = in.nextInt();
            if (num == 0) {
                System.out.println("Has introducido un numero nulo");
                i--;
            }
            if (num < 0) {
                negativo++;
            } else {
                positivo++;
            }
        }
        System.out.printf("De %d numeros inbtroducidos,"
        + "%d son negativos y %d positivos\n",N,negativo,positivo);
    }
}
