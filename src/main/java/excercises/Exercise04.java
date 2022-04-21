package excercises;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise04 {
    public static void exercise() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("A continuación, se calculará el precio final de un producto.");
        try {
            System.out.println("Por favor, introduzca el precio del producto sin IVA:");
            Double price = scanner.nextDouble();
            calc(price);
        } catch (InputMismatchException e) {
            System.out.println("ERROR, sólo se admiten números.\nVolviendo al Menú Principal...\n");
            scanner.next();
        }
    }

    public static void calc(double price) {
        System.out.println("El precio final del producto es de $" + (price * 1.21) + ".\n");
    }
}
