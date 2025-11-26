/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX3;

/**
 *
 * @author adria
 */
public class OrdinadorProva {
    public static void main(String[] args) {
        Ordinador pc = new Ordinador("Intel i7", 16, "FullHD");

        pc.encendre();
        pc.executarAplicacio("Navegador");
        pc.activarProtectorPantalla();
        pc.tancarAplicacio();
        pc.desactivarProtectorPantalla();
        pc.apagar();

        System.out.println(pc.toString());
    }
}

