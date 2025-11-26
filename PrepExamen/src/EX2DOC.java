/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

public class EX2DOC {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Introdueix la teva edat: ");
        int edat = in.nextInt();

        if (esMajorEdat(edat)) {
            System.out.println("Ets major d'edat.");
        } else {
            System.out.println("No ets major d'edat.");
        }
    }

    private static boolean esMajorEdat(int edat) {
        return edat >= 18;
    }
}
