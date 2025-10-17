/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package condicionales;

import java.util.Scanner;

/**
 *
 * @author aco9500
 */
public class Ex10 {
    public static void main(String[] args) {
        //variables
        double salari =0;
        double horas;
        Scanner in = new Scanner(System.in);
        //programa
        System.out.println("Introdueix les horas traballades: ");
        horas=in.nextDouble();
        if (horas<=130) {
            double salari_brut = salari + (horas*15);
            if (salari_brut<=500) {
               double salari_net = salari_brut;
                System.out.println("El salari net es: "+salari_net);
            } else if (salari_brut<=900) {
                double primer_impost = 400*0.25;
                double segon_impost = (salari_brut-900)*0.45;
                double salari_net1 = salari_brut - primer_impost - segon_impost;
                System.out.println("El salari net es: "+salari_net1);
            } else {
                double primer_impost=salari_brut-500;
                double salari_net2 = salari_brut-(primer_impost*0.25);
                System.out.println("El salari net es: "+salari_net2);
            }
        } else {
            double horas_restants=horas-130;
            double salari_brut =(horas_restants*15)*1.5+(130*15);
            double salari_brut_final = salari_brut -(400*0.25);
            double segon_impost = (salari_brut_final - 900)*0.45;
            double salari_net3 = salari_brut_final - segon_impost;
            System.out.println("El salari net es: "+salari_net3);
        }
    }
}
