package excercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Ejercicio 5
 */
public class Exercise05 {
    /**
     * Muestra por consola los números pares e impares del 0 al 100.
     */
    public static void exercise() {
        System.out.println("* Ejercicio 5 - Números con while *");
        int i = 0;
        ArrayList<Integer> odd = new ArrayList<Integer>();
        ArrayList<Integer> pair = new ArrayList<Integer>();
        while (i <= 100) {
            if (i % 2 == 1) {
                odd.add(i);
            } else {
                pair.add(i);
            }
            i++;
        }

        System.out.println(
                "A continuación, se muestran los números pares del 0 al 100:\n" +
                        pair + "\n" +
                        "A continuación, se muestran los números pares del 0 al 100:\n" +
                        odd
        );
    }
}
