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
public class Ex13 {
    public static void main(String[] args) {
        //variable
        double euros,yen,libras,pesos,dolares;
        int menu;
        Scanner in= new Scanner(System.in);
        //programa
        System.out.println("Introdueix euros: ");
        euros=in.nextDouble();
        System.out.println("A que lo quieres cambiar?");
        System.out.printf("Opciones:\n1 = Dolares\n2 = Yen\n3 = Libras\n4 = Pesos\n");
        menu=in.nextInt();
        switch (menu) {
            case 1:
                dolares=euros*1.17;
                break;
            case 2:   
                yen=euros*174.89;
                break;
            case 3:
                libras=euros*0.87;
                break;
            case 4:
                pesos=euros*21.67;
                break;
            default:
                System.out.println("Moneda Incorrecta");
        }
    }
}
