/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica.examenes;

import java.util.Scanner;

public class Ex5Examen {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num1, num2;
        char operacion;
        double resultado;

        System.out.print("Introduce el primer número: ");
        num1 = in.nextInt();

        System.out.print("Introduce el segundo número: ");
        num2 = in.nextInt();

        System.out.print("Introduce la operación (+, -, *, /): ");
        operacion = in.next().charAt(0);  // lee el primer carácter

        switch (operacion) {
            case '+':
                resultado = num1 + num2;
                System.out.println("Resultado: " + resultado);
                break;

            case '-':
                resultado = num1 - num2;
                System.out.println("Resultado: " + resultado);
                break;

            case '*':
                resultado = num1 * num2;
                System.out.println("Resultado: " + resultado);
                break;

            case '/':
                if (num2 == 0) {
                    System.out.println("No se puede dividir entre cero.");
                } else {
                    resultado = (double) num1 / num2;
                    System.out.println("Resultado: " + resultado);
                }
                break;

            default:
                System.out.println("Operación no válida.");
                break;
        }

        in.close();
    }
}
