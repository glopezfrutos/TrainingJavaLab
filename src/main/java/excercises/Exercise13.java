package excercises;

import java.util.*;

public class Exercise12 {
    public static void exercise() {
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

    public static String compare(String userInput1, String userInput2) {
        if (areIquals(userInput1, userInput2)) {
            return "Las dos palabras son iguales.";
        }
        return "Las dos palabras son distintas, se muestran resaltadas las diferencias:" +
                "\n" + showDifferences(userInput1, userInput2);
    }

    public static boolean areIquals(String term1, String term2) {
        return Objects.equals(term1, term2);
    }

    public static String showDifferences(String userInput1, String userInput2) {
        String smaller = orderByLength(userInput1, userInput2)[0];
        String bigger = orderByLength(userInput1, userInput2)[1];
        return showEachDifference(smaller, bigger)
                + ANSI_GREEN_BACKGROUND + bigger.substring(smaller.length()) + ANSI_RESET;
    }

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

    public static String[] orderByLength(String userInput1, String userInput2) {
        String[] array = {userInput1, userInput2};
        Arrays.sort(array, Comparator.comparing(String::length));
        return array;
    }

    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String ANSI_RESET = "\u001B[0m";
}
