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
public class Ex17 {
    public static void main(String[] args) {
        int min=0,max=0,opcio,num,contador=0;
        double media;
        Scanner in = new Scanner(System.in);
        do {            
            System.out.println("Introdueix num");
            num=in.nextInt();
            if (num<min) {
                min=num;
            }
            if (num>max) {
                max=num;
            }
            m
                  
                    
                    edia+=num;
            contador++;
            System.out.println("Vols seguir introduint nums? 1-Si 0-No");
            opcio=in.nextInt();
        } while (opcio!=0);
    }
}
