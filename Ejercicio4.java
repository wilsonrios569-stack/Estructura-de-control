package ejercicio4;

/**
 * @author [Wilson Joel Rios Rios]
 */
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            System.out.print("Ingrese la nota del estudiante: ");
            double nota = teclado.nextDouble();

            if (nota >= 7.0) {
                System.out.println("Aprobado");
            } else {
                System.out.println("Reprobado");
            }
        }
    }
}
