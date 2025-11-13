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
public class Carnet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Tienes carnet de conducir?): ");
        boolean tieneCarnet = sc.nextBoolean();

        System.out.print("¿Has bebido alcohol?: ");
        boolean haBebido = sc.nextBoolean();

        if (tieneCarnet && !haBebido) {
            System.out.println("Puedes conducir.");
        } else {
            System.out.println("No puedes conducir.");
        }
    }
}
