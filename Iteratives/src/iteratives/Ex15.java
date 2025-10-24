/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iteratives;

/**
 *
 * @author aco9500
 */
public class Ex15 {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            System.out.printf("Taula de multiplicar del %d\n",i);
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%dx%d=%d\n",i,j,i*j);
            }
            System.out.println("");
        }
    }
}
