package excercises;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Ejercicio 9
 */
public class Exercise09 {
    /**
     * Submenú para pedir al usuario el parámetro y agregarlo al String dado.
     */
    public static void exercise() {
        System.out.println("* Ejercicio 9 - Reemplazo de caracteres *");

        Scanner scanner = new Scanner(System.in);
        String exercisePhrase = "La sonrisa sera la mejor arma contra la tristeza";

        System.out.println("Dada la frase inicial \"" + exercisePhrase + "\"" +
                "\nSe cambiarán todas las \"a\" por \"e\" y se agregará la frase que añada a continuación:");
        try {
            String userInput = scanner.nextLine();
            System.out.println("\"" + exercisePhrase.replace("a", "e") + " " + userInput + "\"");

        } catch (InputMismatchException e) {
            System.out.println("ERROR.\nVolviendo al Menú Principal...\n");
            scanner.next();
        }
    }
}
