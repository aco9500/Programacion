/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica.examenes;

import java.util.Scanner;

/**
 *
 * @author adria
 */
public class EntradaCine {
    public static void main(String[] args) {
        int edad;
        boolean carnet;
        Scanner in=new Scanner(System.in);
        System.out.println("Cuantos años tienes?: ");
        edad = in.nextInt();
        System.out.println("Tines carnet joven?: ");
        carnet = in.nextBoolean();
        if ((edad<18 && carnet) || edad>65) {
            System.out.println("Entrada gratuita");
        } else {
            System.out.println("Debes pagar entrada");
        }
    }
}
