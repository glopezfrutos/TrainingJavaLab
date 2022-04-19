package excercises;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise02 {
    public static void exercise() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("A continuación, se compararán dos números que ingrese.");
        try {
            System.out.println("Por favor, introduzca el primer número entero:");
            int firstNumber = scanner.nextInt();
            System.out.println("Por favor, introduzca el segundo número entero:");
            int secondNumber = scanner.nextInt();
            System.out.println(check(firstNumber, secondNumber));
        } catch (InputMismatchException e) {
            System.out.println("ERROR, sólo se admiten números emterps.\nVolviendo al Menú Principal...\n");
            scanner.next();
        }
    }

    public static String check(int firstNumber, int secondNumber) {
        System.out.println("Eligió los números " + firstNumber + " y " + secondNumber + ". ");
        if (areEqual(firstNumber, secondNumber)) {
            return "Los dos números son iguales.\n";
        }
        return greater(firstNumber, secondNumber);
    }

    public static boolean areEqual(int firstNumber, int secondNumber) {
        return firstNumber == secondNumber;
    }

    public static String greater(int firstNumber, int secondNumber) {
        if (isGreater(firstNumber, secondNumber)) {
            return "El primer número es mayor que el segundo.\n";
        }
        return "El segundo número es mayor que el primero.\n";
    }

    public static boolean isGreater(int firstNumber, int secondNumber) {
        return firstNumber > secondNumber;
    }
}
