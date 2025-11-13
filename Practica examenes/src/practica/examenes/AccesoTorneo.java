/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica.examenes;

import java.util.Scanner;

/**
 *
 * @author adria
 */

public class AccesoTorneo {
    public static void main(String[] args) {
        // Variables
        int edad;
        boolean permiso;
        String ciudad;

        Scanner in = new Scanner(System.in);

        // Entrada de datos
        System.out.print("¿Cuántos años tienes?: ");
        edad = in.nextInt();

        in.nextLine(); // Limpiar buffer antes de leer String

        System.out.print("¿Dónde vives?: ");
        ciudad = in.next();

        System.out.print("¿Tienes permiso parental? (true/false): ");
        permiso = in.nextBoolean();

        // Condiciones de inscripción
        if ((edad > 15 && ciudad.equals("Barcelona")) || 
            (edad >= 13 && edad <= 15 && ciudad.equals("Barcelona") && permiso)) {

            System.out.println("Puedes participar en el torneo.");

        } else if (edad < 13) {
            System.out.println("No puedes inscribirte. Eres menor de 13 años.");

        } else if (!ciudad.equals("Barcelona")) {
            System.out.println("No puedes inscribirte. Solo para residentes en Barcelona.");

        } else if (edad >= 13 && edad <= 15 && !permiso) {
            System.out.println("No puedes inscribirte. Necesitas permiso parental.");

        } else {
            System.out.println("No puedes inscribirte.");
        }

        in.close();
    }
}
