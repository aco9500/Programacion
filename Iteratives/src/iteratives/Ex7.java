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
public class Ex7 {
    public static void main(String[] args) {
        int num,positiu=0,negatiu=0,contador=0;
        Scanner in = new Scanner(System.in);
        do {            
            System.out.println("introdueix num: ");
            num = in.nextInt();
            if (num>0) {
                positiu++;
            }else if (num<0) {
                negatiu++;
            }else{
                System.out.println("Sortim del programa...");
            }
            contador++;
        } while (num!=0);
        System.out.printf("De %d numeros inbtroducidos,"
        + "%d son negativos y %d positivos\n",contador-1,negatiu,positiu);
    }
}
