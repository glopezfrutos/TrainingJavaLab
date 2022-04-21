package excercises;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise10 {
    public static void exercise() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, introduzca una frase:");
        try {
            String userInput = scanner.nextLine();
            System.out.println("\"" + userInput.replace(" ", "") + "\"");

        } catch (InputMismatchException e) {
            System.out.println("ERROR.\nVolviendo al Menú Principal...\n");
            scanner.next();
        }
    }
}
