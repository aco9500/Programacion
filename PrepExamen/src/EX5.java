import java.util.Scanner;

public class EX5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedir número al usuario
        System.out.print("Introduce un número positivo: ");
        int num = sc.nextInt();

        // Validar que sea positivo
        if (num <= 0) {
            System.out.println("El número debe ser mayor que cero.");
        } else {
            // Llamamos al método para mostrar del 1 al n
            mostrarHasta(num);
        }
    }

    // Método que muestra los números del 1 hasta n
    public static void mostrarHasta(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println(); // salto de línea final
    }
}
