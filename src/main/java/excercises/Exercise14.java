package excercises;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 * Ejercicio 14
 */
public class Exercise14 {
    /**
     * Submenú para pedir al usuario el parámetro int y mostrar los números de dos en dos hasta 1000.
     */
    public static void exercise() {
        System.out.println("* Ejercicio 14 - Números desde userInput hasta 1000 *");
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Por favor, introduzca un número:");
            int userInput = scanner.nextInt();
            System.out.println("A continuación se muestra el conjunto de números desde " +
                    userInput +
                    " hasta 1000:\n" +
                    counter(userInput));
        } catch (
                InputMismatchException e) {
            System.out.println("ERROR. Por favor ingresar un número entero.\nVolviendo al Menú Principal...\n");
            scanner.next();
        }
    }

    /**
     * @param userInput dado un número
     * @return devuelve una lista desde éste hasta 1000.
     */
    public static List<Integer> counter(int userInput) {
        ArrayList<Integer> counter = new ArrayList<>();
        for (int i = userInput; i <= 1000; i += 2) {
            counter.add(i);
        }
        return counter;
    }
}
