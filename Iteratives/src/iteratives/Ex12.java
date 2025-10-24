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
public class Ex12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random aleatori = new Random();
        int secret,num,intents=0;
        secret= aleatori.nextInt(1,100);
        do {            
            System.out.println("Introdueix un num: ");
            num=in.nextInt();
            intents++;
            if (num>secret) {
                System.out.println("El numero a adivinar es mes petit!");
            }else if (num<secret) {
                System.out.println("El numero a adivinar es mes gran!");
            } else {
                System.out.printf("Enhorabona! Has trobar el num secret!"
                +"amb %d intentes\n",intents);
            }
        } while (num!=secret);
    }
}
