package ejercicio10;

/**
 * @author [Wilson Joel Rios Rios]
 */
import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            int suma = 0;

            System.out.println("Por favor ingrese 10 números enteros secuencialmente:");
            for (int i = 1; i <= 10; i++) {
                System.out.print("Número " + i + ": ");
                int valor = teclado.nextInt();
                suma += valor;
            }

            double promedio = (double) suma / 10;

            System.out.println("\n--- RESULTADOS ---");
            System.out.println("Suma de los números: " + suma);
            System.out.println("Promedio calculado: " + promedio);
        }
    }
}
