
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author adria
 */
public class EX5DOC {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int distancia;
        System.out.println("Introdueix una distancia en milles: ");
        distancia=in.nextInt();
        double km=millesAKm(distancia);
        System.out.printf("%d milles equivalen a %.4f quilòmetres.\n", distancia, km);
    }
    public static double millesAKm(int milles){
        return milles*1.6093;
    }
}
