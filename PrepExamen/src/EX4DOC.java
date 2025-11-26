
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author adria
 */
public class EX4DOC {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        System.out.print("Introdueix un num enter: ");
        num=in.nextInt();
        int signe=obteSigne(num);
        switch (signe) {
            case 1 -> System.out.println("El numero es positiu");
            case -1 -> System.out.println("El numero es negatiu");
            default -> System.out.println("El numero es 0");
        }
    }
    public static int obteSigne(int x){
        if (x>0) {
            return 1;
        } else if (x==0) {
            return 0;
        } else {
            return -1;
        }
    }
}
