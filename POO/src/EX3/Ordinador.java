/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package EX3;

/**
 *
 * @author aco9500
 */

public class Ordinador {
    // Atributs
    private String processador;
    private int memoria; // en GB
    private String pantalla;
    
    private boolean encès;
    private String aplicacioEnExecucio;
    private boolean protectorPantallaActiu;

    // Constructor
    public Ordinador(String processador, int memoria, String pantalla) {
        this.processador = processador;
        this.memoria = memoria;
        this.pantalla = pantalla;
        this.encès = false;
        this.aplicacioEnExecucio = null;
        this.protectorPantallaActiu = false;
    }

    // Mètodes
    public void encendre() {
        if (!encès) {
            encès = true;
            System.out.println("L'ordinador s'ha encès.");
        } else {
            System.out.println("L'ordinador ja està encès.");
        }
    }

    public void apagar() {
        if (!encès) {
            System.out.println("L'ordinador ja està apagat.");
        } else if (aplicacioEnExecucio != null) {
            System.out.println("Tanca l'aplicació abans d'apagar l'ordinador.");
        } else {
            encès = false;
            protectorPantallaActiu = false;
            System.out.println("L'ordinador s'ha apagat.");
        }
    }

    public void executarAplicacio(String aplicacio) {
        if (!encès) {
            System.out.println("No pots executar aplicacions. L'ordinador està apagat.");
        } else if (aplicacioEnExecucio != null) {
            System.out.println("Ja hi ha una aplicació en execució: " + aplicacioEnExecucio);
        } else {
            aplicacioEnExecucio = aplicacio;
            System.out.println("Executant aplicació: " + aplicacio);
        }
    }

    public void tancarAplicacio() {
        if (aplicacioEnExecucio != null) {
            System.out.println("Tancant aplicació: " + aplicacioEnExecucio);
            aplicacioEnExecucio = null;
        } else {
            System.out.println("No hi ha cap aplicació en execució.");
        }
    }

    public void activarProtectorPantalla() {
        if (!encès) {
            System.out.println("L'ordinador està apagat.");
        } else if (!protectorPantallaActiu) {
            protectorPantallaActiu = true;
            System.out.println("Protector de pantalla activat.");
        } else {
            System.out.println("El protector de pantalla ja està activat.");
        }
    }

    public void desactivarProtectorPantalla() {
        if (!encès) {
            System.out.println("L'ordinador està apagat.");
        } else if (protectorPantallaActiu) {
            protectorPantallaActiu = false;
            System.out.println("Protector de pantalla desactivat.");
        } else {
            System.out.println("El protector de pantalla no està activat.");
        }
    }

    @Override
    public String toString() {
        return "Ordinador{" +
                "processador='" + processador + '\'' +
                ", memoria=" + memoria + "GB" +
                ", pantalla='" + pantalla + '\'' +
                ", encès=" + encès +
                ", aplicacioEnExecucio='" + aplicacioEnExecucio + '\'' +
                ", protectorPantallaActiu=" + protectorPantallaActiu +
                '}';
    }
}
