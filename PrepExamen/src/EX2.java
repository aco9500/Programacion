import java.util.Scanner;

public class EX2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Entrada de datos
        System.out.print("Introduce el número inicial: ");
        int inicio = sc.nextInt();
        System.out.print("Introduce el número final: ");
        int fin = sc.nextInt();
        // Validación opcional: intercambiar si el inicio es mayor que el final
        if (inicio > fin) {
            int temp = inicio;
            inicio = fin;
            fin = temp;
        }
        // Llamadas a los métodos
        int totalPares = contarPares(inicio, fin);
        int totalImpares = contarImpares(inicio, fin);
        // Mostrar resultados
        System.out.println("Entre " + inicio + " y " + fin + ":");
        System.out.println("Números pares: " + totalPares);
        System.out.println("Números impares: " + totalImpares);
    }
    // Método para contar pares
    public static int contarPares(int inicio, int fin) {
        int contador = 0;
        for (int i = inicio; i <= fin; i++) {
            if (i % 2 == 0) {
                contador++;
            }
        }
        return contador;
    }
    // Método para contar impares
    public static int contarImpares(int inicio, int fin) {
        int contador = 0;
        for (int i = inicio; i <= fin; i++) {
            if (i % 2 != 0) {
                contador++;
            }
        }
        return contador;
    }
}

