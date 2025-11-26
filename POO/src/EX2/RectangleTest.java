/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex2;

/**
 *
 * @author aco9500
 */
public class RectangleTest {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(6, 3);
        System.out.println(r1.toString());
        System.out.println("Area de R1 = "+r1.area());
        System.out.println("Perimetre de R1 = "+r1.perimetre());
        Rectangle r2 = new Rectangle(6, 3);
        System.out.println(r2.toString());
        System.out.println("Area de R2 = "+r2.area());
        System.out.println("Perimetre de R2 = "+r2.perimetre());
        if(r1.equals(r2)){
            System.out.println("Els rectangles son iguals!");
        }else{
            System.out.println("Els rectangles son diferents!");
        }
           
                
    }
}
