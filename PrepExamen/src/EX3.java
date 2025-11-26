import java.util.Scanner;

public class EX3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Pedimos cuántos alumnos hay
        System.out.print("¿Cuántos alumnos hay? ");
        int numAlumnos = sc.nextInt();

        // 2. Bucle para cada alumno
        for (int i = 1; i <= numAlumnos; i++) {
            System.out.println("Alumno " + i + ":");

            // Pedimos 3 notas
            System.out.print("Introduce la nota 1: ");
            double n1 = sc.nextDouble();

            System.out.print("Introduce la nota 2: ");
            double n2 = sc.nextDouble();

            System.out.print("Introduce la nota 3: ");
            double n3 = sc.nextDouble();

            // 3. Llamamos al método para calcular la media
            double media = calcularMedia(n1, n2, n3);

            // 4. Mostramos resultado
            System.out.printf("Media: %.2f -> ", media);
            if (media >= 5) {
                System.out.println("Aprobado");
            } else {
                System.out.println("Suspenso");
            }

            System.out.println(); // Línea en blanco
        }
    }

    // Método para calcular la media de 3 notas
    public static double calcularMedia(double nota1, double nota2, double nota3) {
        return (nota1 + nota2 + nota3) / 3;
    }
}
