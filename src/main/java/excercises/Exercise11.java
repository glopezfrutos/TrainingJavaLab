package excercises;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise11 {
    public static void exercise() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, introduzca una frase a analizar:");
        try {
            String userInput = scanner.nextLine();
            System.out.println("Cantidad de caracteres: " + userInput.length() +
                    "\n Cantidad de \"a\": " + vowelCounter(userInput, "a") +
                    "\n Cantidad de \"e\": " + vowelCounter(userInput, "e") +
                    "\n Cantidad de \"i\": " + vowelCounter(userInput, "i") +
                    "\n Cantidad de \"o\": " + vowelCounter(userInput, "o") +
                    "\n Cantidad de \"u\": " + vowelCounter(userInput, "u"));

        } catch (InputMismatchException e) {
            System.out.println("ERROR.\nVolviendo al Menú Principal...\n");
            scanner.next();
        }
    }

    public static int vowelCounter(String userInput, String vowel) {
        int counter = 0;
        for (int i = 0; i < userInput.length(); i++) {
            if (isVowel(userInput.charAt(i), vowel))
                counter++;
        }
        return counter;
    }

    private static boolean isVowel(char character, String vowel) {
        return vowel.contains(String.valueOf(character).toLowerCase());
    }
}
