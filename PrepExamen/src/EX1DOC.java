
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author adria
 */
public class EX1DOC {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1,num2;
        System.out.print("Introdueix num1: ");
        num1=in.nextInt();
        System.out.print("Introdueix num2: ");
        num2=in.nextInt();
        double prod=producte(num1,num2);
        System.out.printf("El producte de %d i %d es: %.2f\n",num1,num2,prod);
    }
    public static double producte(double x,double y){
        double producte=x*y;
        return producte;
    }
}
