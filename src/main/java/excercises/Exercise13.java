package excercises;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Ejercicio 13
 */
public class Exercise13 {
    /**
     * Muestra la fecha y la hora por consola.
     */
    public static void exercise() {
        System.out.println("* Ejercicio 13 - Fecha y hora *");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println("Fecha y hora actual:\n" + dtf.format(LocalDateTime.now()));
    }
}
