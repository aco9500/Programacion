/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package millesametres;

import java.util.Scanner;

/**
 *
 * @author aco9500
 */
public class Millesametres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final double MILLES_A_METRES = 1852; //Factor conversió constant
        Scanner lector = new Scanner(System.in);
        //Llegir distancia en milles
        System.out.print("Entra la distància en milles: ");
        double distanciaEnMilles = lector.nextDouble();
        // calcular conversio de milles a metres
        double distanciaEnMetres = distanciaEnMilles * MILLES_A_METRES;
        //imprimir resultat 
        System.out.println(distanciaEnMilles + " milles equivalen a "
                + distanciaEnMetres + " metres " );
    }
    
}
