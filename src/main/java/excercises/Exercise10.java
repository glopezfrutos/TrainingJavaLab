package excercises;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Ejercicio 10
 */
public class Exercise10 {
    /**
     * Submenú para pedir al usuario un String y eliminarle los espacios.
     */
    public static void exercise() {
        System.out.println("* Ejercicio 10 - Eliminado de espacios *" +
                "\nPor favor, introduzca una frase:");

        Scanner scanner = new Scanner(System.in);
        try {
            String userInput = scanner.nextLine();
            System.out.println("\"" + userInput.replace(" ", "") + "\"");

        } catch (InputMismatchException e) {
            System.out.println("ERROR.\nVolviendo al Menú Principal...\n");
            scanner.next();
        }
    }
}
