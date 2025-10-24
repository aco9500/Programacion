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
public class Ex16 {
    public static void main(String[] args) {
        int num,contador=0;
        Scanner in = new Scanner(System.in);
        do {            
            System.out.printf("Introdueix num enter i positiu: ");
            num=in.nextInt();
            if (num<=0) {
                System.out.println("El num no es positiu");
            }
        } while (num<=0);
        if (num<=2) {
            System.out.println("No hi ha numeros primers entre 0 i "+num);
        }
        for (int i=2;i<num ;i++){
            boolean primer=true;
            for (int j = 2; j <=Math.sqrt(num); j++) {
            if (num%i==0) {
                primer=false;
            } 
            }
            if (primer==true) {
                System.out.printf("%d",i);
            }
        }
        System.out.printf("Se han trobat %d numeros primers\n",contador);
    }
}
