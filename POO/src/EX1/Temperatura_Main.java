/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX1;

import java.util.Scanner;

/**
 *
 * @author aco9500
 */
public class Temperatura_Main {
    public static void main(String[] args) {
        int opcio;
        Temperatura t = new Temperatura();
        do {
            opcio=mostrarMenu();
            switch (opcio) {
                case 1:
                    mostrarTemperatura(t);
                    break;
                case 2:
                    definirTemperatura(t);
                    break;
                case 3:
                    mostrarFahrenheit(t);
                    break;
                case 0:
                    System.out.println("Sortint del programa...");
                    break;
                default:
                    System.out.println("Opcio incorrecte!");
                    break;
            }
            
        } while (opcio!=0);
    }

    private static int mostrarMenu() {
        Scanner in = new Scanner(System.in);
        System.out.println("1-Mostrar temperatura");
        System.out.println("2-Modificar temperatura");
        System.out.println("3-Mostrar temperatura amb graus Fahrenheit");
        System.out.println("0-Sortir");
        System.out.println("Escull opcio: ");
        return in.nextInt();
    }

    private static void mostrarTemperatura(Temperatura t) {
        if(t.getCelsius()==0){
            System.out.println("Encara no s'ha definit la temperatura!");
        }else{
            System.out.println(t.toString());
        }
    }

    private static void definirTemperatura(Temperatura t) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introdueix la temperatura: ");
        t.setCelsius(in.nextDouble());
    }

    private static void mostrarFahrenheit(Temperatura t) {
        if(t.getCelsius()==0){
            System.out.println("Encara no s'ha definit la temperatura!");
        }else{
            System.out.println("La temperatura de "+t.getCelsius()+" equival a "+t.grausFahrenheit());
        }
    }
    
}
