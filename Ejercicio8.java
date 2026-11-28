package ejercicio8;

/**
 * @author [Wilson Joel Rios Rios]
 */
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            String clave;

            do {
                System.out.print("Ingrese la contraseña del sistema: ");
                clave = teclado.nextLine();

                if (!clave.equals("java2026")) {
                    System.out.println("Contraseña incorrecta. Intente de nuevo.");
                }
            } while (!clave.equals("java2026"));

            System.out.println("Acceso concedido.");
        }
    }
}
