package ejercicio9;

/**
 * @author [Wilson Joel Rios Rios]
 */
import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            System.out.print("Ingrese el número entero para generar su tabla: ");
            int numero = teclado.nextInt();

            System.out.println("Tabla de multiplicar del " + numero + ":");
            for (int i = 1; i <= 12; i++) {
                System.out.println(numero + " x " + i + " = " + (numero * i));
            }
        }
    }
}
