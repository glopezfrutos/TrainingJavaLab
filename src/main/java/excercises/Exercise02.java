package excercises;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Ejercicio 2
 */
public class Exercise02 {
    /**
     * Submenú para pedir al usuario los parámetros y llamar al método check por consola.
     */
    public static void exercise() {
        System.out.println("* Ejercicio 2 - Compararación de números ingresados por el usuario *" +
                "\nA continuación, se compararán los dos números que ingrese.");

        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Por favor, introduzca el primer número entero:");
            int firstNumber = scanner.nextInt();
            System.out.println("Por favor, introduzca el segundo número entero:");
            int secondNumber = scanner.nextInt();
            System.out.println(check(firstNumber, secondNumber));
        } catch (InputMismatchException e) {
            System.out.println("ERROR, sólo se admiten números emteros.\nVolviendo al Menú Principal...\n");
            scanner.next();
        }
    }

    /**
     * @param firstNumber  A partir de un primer número y
     * @param secondNumber un segundo número
     * @return devuelve un String con el resultado de la comparación de ambos números.
     */
    public static String check(int firstNumber, int secondNumber) {
        System.out.println("Comparando los números " + firstNumber + " y " + secondNumber + "...");
        if (firstNumber == secondNumber) {
            return "Los dos números son iguales.\n";
        }
        if (firstNumber > secondNumber) {
            return "El primer número es mayor que el segundo.\n";
        }
        return "El segundo número es mayor que el primero.\n";
    }
}
