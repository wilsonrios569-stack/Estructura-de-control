package ejercicio3;

/**
 * @author [Wilson Joel Rios Rios]
 */
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            System.out.print("Ingrese la edad de la persona: ");
            int edad = teclado.nextInt();

            if (edad >= 18) {
                System.out.println("Es mayor de edad.");
            }
        }
    }
}
