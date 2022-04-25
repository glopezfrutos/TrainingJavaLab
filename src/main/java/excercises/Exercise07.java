package excercises;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Ejercicio 7
 */
public class Exercise07 {
    /**
     * Submenú para pedir al usuario el parámetro y comprobar si el éste es un número mayor a 0.
     */
    public static void exercise() {
        System.out.println("* Ejercicio 7 - Número por teclado *");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, introduzca un número mayor a cero:");
        int number = 0;
        try {
            do {
                number = scanner.nextInt();
            } while (number < 1);
            System.out.println("Usted ingresó el número " + number);
        } catch (InputMismatchException e) {
            System.out.println("ERROR, sólo se admiten números.\nVolviendo al Menú Principal...\n");
            scanner.next();
        }
    }
}
