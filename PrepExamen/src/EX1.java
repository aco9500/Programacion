import java.util.Scanner;

public class EX1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;

        System.out.print("Introdueix un num enter positiu: ");
        num = in.nextInt();

        // Validación opcional
        if (num < 0) {
            System.out.println("El número ha de ser positiu.");
        } else {
            int resultat = calcularFactorial(num);
            System.out.println("El factorial de " + num + " és: " + resultat);
        }
    }

    public static int calcularFactorial(int n) {
        int factorial = 1;  // Muy importante inicializar a 1

        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;  // acumulación
        }

        return factorial; // Devuelve el resultado
    }
}