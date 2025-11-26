
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author adria
 */
public class EX3DOC {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1,num2;
        System.out.print("Introdueix el num1: ");
        num1=in.nextInt();
        System.out.print("Introdueix el num2: ");
        num2=in.nextInt();
        int menor=menor(num1,num2);
        System.out.printf("El numero mes petit es: %d\n",menor);
    }
    public static int menor(int x,int y){
        if (x>y) {
            return y;
        } else {
            return x;
        }
    }
}
