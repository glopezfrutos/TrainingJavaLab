package excercises;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise08 {
    public static void exercise() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("A continuación, se comprobará si el día de la semana ingresado es laboral.");
        try {
            String day = scanner.nextLine();
            switch (day) {
                case "lunes", "martes", "miércoles", "jueves", "viernes",
                        "Lunes", "Martes", "Miércoles", "Jueves", "Viernes",
                        "miercoles", "Miercoles"-> {
                    System.out.println("El día "+ day + " es laboral.");
                }
                case "sábado", "domingo" -> {
                    System.out.println("El día "+ day + " no es laboral.");
                }
                default -> System.out.println("ERROR, sólo se admiten días de la semana.\nVolviendo al Menú Principal...\n");
            }
        } catch (InputMismatchException e) {
            System.out.println("ERROR, sólo se admiten días de la semana.\nVolviendo al Menú Principal...\n");
            scanner.next();
        }
    }
}
