package excercises;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Ejercicio 8
 */
public class Exercise08 {
    /**
     * Submenú para pedir al usuario el parámetro y comprobar si éste es un día de la semana laboral.
     */
    public static void exercise() {
        System.out.println("* Ejercicio 8 - Días laborales *" +
                "\nPor favor, ingrese un día de la semana para para comprobar si es laboral:");
        Scanner scanner = new Scanner(System.in);

        try {
            String day = scanner.nextLine();
            switch (day) {
                case "lunes", "martes", "miércoles", "jueves", "viernes",
                        "Lunes", "Martes", "Miércoles", "Jueves", "Viernes",
                        "miercoles", "Miercoles" -> {
                    System.out.println("El día " + day + " es laboral.");
                }
                case "sábado", "domingo" -> {
                    System.out.println("El día " + day + " no es laboral.");
                }
                default -> System.out.println("ERROR, sólo se admiten días de la semana.\nVolviendo al Menú Principal...\n");
            }
        } catch (InputMismatchException e) {
            System.out.println("ERROR, sólo se admiten días de la semana.\nVolviendo al Menú Principal...\n");
            scanner.next();
        }
    }
}
