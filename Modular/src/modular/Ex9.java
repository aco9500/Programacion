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
public class Ex9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num,quantitat,major=0;
        System.out.print("Quants nums vols introduir: ");
        quantitat=in.nextInt();
        for (int i = 1; i <= quantitat; i++) {
            System.out.print("Num"+i+"=");
            num=in.nextInt();
            if (i==1) {
                major=num;
            } else {
                major=major(num,major);
            }
        }
        System.out.println("Dels nums introduits el mes gran es "+major);
    }
    private static int major(int x,int y){
        if(x>y){
            return x;
        }else{
            return y;
        }
    }
}
