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
public class Ex4Seq {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double radi,longitud,area,volum,pi=3.14;
        System.out.print("introduce el radio de una esfera: ");
        radi=in.nextDouble();
        longitud=2*pi*radi;
        area=pi*(radi*radi);
        volum=(4/3)*pi*(radi*radi*radi);
        System.out.println("Longitud: "+longitud);
        System.out.println("Area: "+area);
        System.out.println("Volumen: "+volum);
    }
}
