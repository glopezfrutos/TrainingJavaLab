package excercises;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Ejercicio 4
 */
public class Exercise04 {
    /**
     * Submenú para pedir al usuario el parámetro y llamar al método calc por consola.
     */
    public static void exercise() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("* Ejercicio 4 - precio final con IVA *" +
                "\nA continuación, se calculará el precio final de un producto.");
        try {
            System.out.println("Por favor, introduzca el precio del producto sin IVA:");
            Double price = scanner.nextDouble();
            calc(price);
        } catch (InputMismatchException e) {
            System.out.println("ERROR, sólo se admiten números.\nVolviendo al Menú Principal...\n");
            scanner.next();
        }
    }

    /**
     * @param price A partir de un precio, imprime en pantalla el precio final con IVA
     */
    public static void calc(double price) {
        System.out.println("El precio final del producto es de $" + (price * 1.21) + ".\n");
    }
}
