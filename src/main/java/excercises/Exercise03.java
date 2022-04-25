package excercises;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Ejercicio 3
 */
public class Exercise03 {
    /**
     * Submenú para pedir al usuario el parámetro y llamar al método surface por consola.
     */
    public static void exercise() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("* Ejercicio 3 - área de un círculo *" +
                "\nA continuación, se calculará el área de un círculo." +
                "Por favor, introduzca el radio del círculo o 0 para volver:");
        try {
            Double radius = scanner.nextDouble();
            System.out.println(surface(radius));
        } catch (InputMismatchException e) {
            System.out.println("ERROR, sólo se admiten números.\nVolviendo al Menú Principal...\n");
            scanner.next();
        }
    }

    /**
     * @param radius A partir de un radio,
     * @return devuelve la superficie del círculo.
     */
    public static String surface(double radius) {
        double pi = 3.1415;
        return "La superficie del círculo es de " + pi * Math.pow(radius, 2) + "\n";
    }
}
