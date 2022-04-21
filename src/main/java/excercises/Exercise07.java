package excercises;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise07 {
    public static void exercise() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("A continuación, se comprobará si el número ingresado es mayor a cero.");
        int number;
        try {
            System.out.println("Por favor, introduzca un número:");
            do {
                number = scanner.nextInt();
            } while (number < 0);
            System.out.println("Usted ingresó el número " + number);
        } catch (InputMismatchException e) {
            System.out.println("ERROR, sólo se admiten números.\nVolviendo al Menú Principal...\n");
            scanner.next();
        }
    }
}
