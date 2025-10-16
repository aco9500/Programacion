/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package condicionales;

import java.util.Scanner;

/**
 *
 * @author adria
 */
public class Ex9 {
    public static void main(String[] args) {
        //variables
        int hora_act,min_act,seg_act,seg_afe;
        Scanner in=new Scanner(System.in);
        //programa
        System.out.print("Introduir hora actual: ");
        hora_act = in.nextInt();
        System.out.print("Introduir minut actual: ");
        min_act = in.nextInt();
        System.out.print("Introduir segon actual: ");
        seg_act = in.nextInt();
        System.out.print("Introduir segon afegit: ");
        seg_afe = in.nextInt();
        int min_afe = 0;
        int hora_afe = 0;

        // Si segons a afegir >= 60, convertim a minuts i segons
        if (seg_afe >= 60) {
            min_afe = seg_afe / 60;
            seg_afe = seg_afe % 60;
        }

        // Si minuts a afegir >= 60, convertim a hores i minuts
        if (min_afe >= 60) {
            hora_afe = min_afe / 60;
            min_afe = min_afe % 60;
        }

        // Sumar temps afegit
        seg_act += seg_afe;
        min_act += min_afe;
        hora_act += hora_afe;

        // Ajustar segons
        if (seg_act >= 60) {
            seg_act -= 60;
            min_act++;
        }

        // Ajustar minuts
        if (min_act >= 60) {
            min_act -= 60;
            hora_act++;
        }

        // Ajustar hores
        if (hora_act >= 24) {
            hora_act -= 24;
        }

        // Mostrar resultat
        System.out.printf("Hora final: %02d:%02d:%02d\n", hora_act, min_act, seg_act);
    }
}
