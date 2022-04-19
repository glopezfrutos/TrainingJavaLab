package excercises;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise03 {
    public static void exercise() {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        int option;

        System.out.println("A continuación, se calculará el área de un círculo.");
        System.out.println("Por favor, introduzca el radio del círculo o 0 para volver:");
        try {
            Double radius = scanner.nextDouble();
            System.out.println(surface(radius));
        } catch (InputMismatchException e) {
            System.out.println("ERROR, sólo se admiten números.\nVolviendo al Menú Principal...\n");
            scanner.next();
        }
    }

    public static String surface(double radius) {
        double pi = 3.1415;
        return "La superficie del círculo es de " + pi * Math.pow(radius, 2) + "\n";
    }
}
