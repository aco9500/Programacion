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
public class Ex5 {
    public static void main(String[] args) {
        int num;
        boolean negativo=false;
        Scanner in = new Scanner(System.in);
        for (int i = 1; i < 5; i++) {
            System.out.println("Introdueix un numero: ");
            num = in.nextInt();
            if (num<0) {
                negativo = true;
            }
            if (num == 0) {
                System.out.println("Has introducido un numero nulo");
                i--;
            }
        }
         if (negativo = false){
                System.out.println("No se ha introducido numero negativo");
            }else{
                System.out.println("Si se ha introducido algun numero negativo");
            }
    }
}
