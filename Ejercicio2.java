package ejercicio2;

/**
 * @author [Wilson Joel Rios Rios]
 */
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            System.out.print("Ingrese el primer numero entero: ");
            int num1 = teclado.nextInt();

            System.out.print("Ingrese el segundo numero entero: ");
            int num2 = teclado.nextInt();

            int suma = num1 + num2;
            int resta = num1 - num2;
            int multiplicacion = num1 * num2;

            System.out.println("\n--- RESULTADOS ---");
            System.out.println("Suma: " + suma);
            System.out.println("Resta: " + resta);
            System.out.println("Multiplicacion: " + multiplicacion);

            if (num2 != 0) {
                double division = (double) num1 / num2;
                int residuo = num1 % num2;
                System.out.println("Division: " + division);
                System.out.println("Residuo: " + residuo);
            } else {
                System.out.println("Division: No permitida (division por cero)");
                System.out.println("Residuo: No disponible (division por cero)");
            }
        }
    }
}
