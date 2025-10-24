/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iteratives;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author aco9500
 */
public class Ex13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random aleatori = new Random();
        int num,intents=0,opcio,min=1,max=101;
        boolean opcio_valida = false;
        System.out.println("Pensa un numero secret");
        do {            
            num=aleatori.nextInt(min,max);
            System.out.printf("Num secret es el %d?\n",num);
            intents++;
            do {                
            System.out.println("Escull opcio: 1-Es mes gran 2- Es mes petit 0-Has encertat");
            opcio=in.nextInt();
                if (opcio==0 || opcio==1 ||opcio==2) {
                    opcio_valida=true;
                } else {
                }
            } while (opcio_valida==false);
            if (opcio==1) {
                min=num;
            } else if (opcio==2) {
                max=num;
            } else if (opcio==0) {
                System.out.printf("Enhorabona, has trobat el numero"
                +"secret amd %d intents\n",intents);
            } else {
            }
         }
        while(opcio!=0);{
                }
        }  
}