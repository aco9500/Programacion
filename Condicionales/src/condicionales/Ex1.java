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
public class Ex1 {
     public static void main(String[] args) {
        //declarem variables
        int edat;
        Scanner in = new Scanner(System.in);
        //programa
        System.out.print("Introdueix la teva edat: ");
        edat=in.nextInt();
        if (edat >= 18){
            System.out.println("Ets major d'edat");
        }else{
            System.out.println("Ets menor d'dedat");
        }
    }  
}
