package excercises;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Ejercicio 11
 */
public class Exercise11 {
    /**
     * Submenú para pedir al usuario un String y contar sus caracteres y discriminando por vocal
     */
    public static void exercise() {
        System.out.println("* Ejercicio 11 - Cuenta de caracteres y vocales *" +
                "\nPor favor, introduzca una frase a analizar:");

        Scanner scanner = new Scanner(System.in);
        try {
            String userInput = scanner.nextLine();
            System.out.println("Cantidad de caracteres: " + userInput.length() +
                    "\nCantidad de \"a\": " + vowelCounter(userInput, "a") +
                    "\nCantidad de \"e\": " + vowelCounter(userInput, "e") +
                    "\nCantidad de \"i\": " + vowelCounter(userInput, "i") +
                    "\nCantidad de \"o\": " + vowelCounter(userInput, "o") +
                    "\nCantidad de \"u\": " + vowelCounter(userInput, "u"));

        } catch (InputMismatchException e) {
            System.out.println("ERROR.\nVolviendo al Menú Principal...\n");
            scanner.next();
        }
    }

    /**
     * @param userInput Dado un String,
     * @param vowel     y una vocal
     * @return devuelve cuántas veces está la vocal en el String.
     */
    public static int vowelCounter(String userInput, String vowel) {
        int counter = 0;
        for (int i = 0; i < userInput.length(); i++) {
            if (isVowel(userInput.charAt(i), vowel))
                counter++;
        }
        return counter;
    }

    /**
     * @param character Dado un char
     * @param vowel     y una vocal
     * @return comprueba si el char es igual a la vocal.
     */
    private static boolean isVowel(char character, String vowel) {
        return vowel.contains(String.valueOf(character).toLowerCase());
    }
}
