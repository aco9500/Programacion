/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modular;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int milles;
        System.out.print("Introdueix una distància en milles: ");
        milles = in.nextInt();

        double km = millesAKm(milles);

        System.out.printf("%d milles equivalen a %.4f quilòmetres.\n", milles, km);
    }

    private static double millesAKm(int milles) {
        return milles * 1.6093;
    }
}
