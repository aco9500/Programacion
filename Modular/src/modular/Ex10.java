/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modular;

import java.util.Scanner;

/**
 *
 * @author aco9500
 */
public class Ex10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int dia,mes,any;
        boolean correcte=false;
        System.out.println("Introdueix dia: ");
        dia=in.nextInt();
        System.out.println("Introdueix mes: ");
        mes=in.nextInt();
        System.out.println("Introdueix any: ");
        any=in.nextInt();
        correcte=validaData(dia,mes,any);
        if (correcte) {
            System.out.println("Dades de la data introduida correctament");
        }else{
            System.out.println("La data es incorrecte");
        }
    }
    private static boolean validaData(int dia,int mes, int any){
        if (dia>=1 && dia <=30) {
            if (mes>=1 && mes<=12) {
                if (any>=0) {
                    return true;
                } else {
                    System.out.println("Any introduit no valid");
                    return false;
                }
            } else {
                System.out.println("Mes introduit no valid");
                return false;
            }
        } else {
            System.out.println("Dia introduit no valid");
            return false;
        }
    }
}
