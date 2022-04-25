package excercises;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Ejercicio 6
 */
public class Exercise06 {
    /**
     * Muestra por consola los números pares e impares del 0 al 100.
     */
    public static void exercise() {
        System.out.println("* Ejercicio 6 - Números con for *");

        ArrayList<Integer> odd = new ArrayList<Integer>();
        ArrayList<Integer> pair = new ArrayList<Integer>();
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 1) {
                odd.add(i);
            } else {
                pair.add(i);
            }
        }

        System.out.println(
                "A continuación, se muestran los números pares del 0 al 100:\n" +
                        pair + "\n" +
                        "A continuación, se muestran los números pares del 0 al 100:\n" +
                        odd
        );
    }
}
