
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author adria
 */
public class EX4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        System.out.print("Introdueix un num enter: ");
        num=in.nextInt();
        int esPar;
        if (esPar(num)) {
            System.out.printf("El num %d es par\n",num);
        } else {
            System.out.printf("El num %d es inpar\n",num);
        }
    }
    public static boolean esPar(int num){
        return num % 2 == 0;
    }
}
