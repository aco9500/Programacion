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
public class LlamadaTLF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int llamada;
        String dia;
        double precio,precio_final;
        System.out.println("Cuanto tiempo dura la llamada: ");
        llamada=in.nextInt();
        System.out.println("Que dia has hecho la llamada: ");
        dia=in.next();
        if (dia.equals("sabado")||dia.equals("domingo")) {
                precio = 0.2;
                precio_final = llamada*precio;
            }else{
            precio = 0.15;
                precio_final = llamada*precio;
            if (llamada > 5) {
                precio_final = precio_final*0.9;
            }
        }
        System.out.printf("El coste total de la llamada es: %.2f\n",precio_final);
    }
}
