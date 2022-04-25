package excercises;

import java.util.*;

/**
 * Ejercicio 12
 */
public class Exercise12 {
    /**
     * Constante para definir resaltar el background de la consola
     */
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";

    /**
     * Constante para resetear el background de la consola
     */
    public static final String ANSI_RESET = "\u001B[0m";

    /**
     * Submenú para pedir al usuario dos parámetros String y comprobar sus diferencias
     */
    public static void exercise() {
        System.out.println("* Ejercicio 12 - Comparativa de dos String *");

        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Por favor, introduzca la primera palabra a comparar:");
            String userInput1 = scanner.nextLine();
            System.out.println("Por favor, introduzca la segunda palabra a comparar:");
            String userInput2 = scanner.nextLine();
            System.out.println(compare(userInput1, userInput2));

        } catch (InputMismatchException e) {
            System.out.println("ERROR.\nVolviendo al Menú Principal...\n");
            scanner.next();
        }
    }

    /**
     * @param userInput1 Dado un primer String
     * @param userInput2 y un segundo String
     * @return devuelve un texto si son iguales y otro si son distintos.
     */
    public static String compare(String userInput1, String userInput2) {
        if (Objects.equals(userInput1, userInput2)) {
            return "Las dos palabras son iguales.";
        }
        return "Las dos palabras son distintas, se muestran resaltadas las diferencias:" +
                "\n" + showDifferences(userInput1, userInput2);
    }

    /**
     * @param userInput1 Dado un primer String
     * @param userInput2 y un segundo String
     * @return llama al método showEachDifference para devolver un nuevo String con las diferencias resaltadas
     */
    public static String showDifferences(String userInput1, String userInput2) {
        String smaller = orderByLength(userInput1, userInput2)[0];
        String bigger = orderByLength(userInput1, userInput2)[1];
        return showEachDifference(smaller, bigger)
                + ANSI_GREEN_BACKGROUND + bigger.substring(smaller.length()) + ANSI_RESET;
    }

    /**
     * @param smaller dado un String más pequeño
     * @param bigger  y otro String igual o más largo
     * @return devuelve un nuevo String con las diferencias resaltadas
     */
    public static String showEachDifference(String smaller, String bigger) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < smaller.length(); i++) {
            if (Objects.equals(smaller.charAt(i), bigger.charAt(i))) {
                result.append(bigger.charAt(i));
            } else {
                result.append(ANSI_GREEN_BACKGROUND).append(bigger.charAt(i)).append(ANSI_RESET);
            }
        }
        return result.toString();
    }

    /**
     * @param userInput1 Dado un primer String
     * @param userInput2 y un segundo String
     * @return los devuelve en un array ordenado por tamaño
     */
    public static String[] orderByLength(String userInput1, String userInput2) {
        String[] array = {userInput1, userInput2};
        Arrays.sort(array, Comparator.comparing(String::length));
        return array;
    }
}
