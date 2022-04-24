package excercises;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Exercise15 {
    public static void exercise() {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        int option;

        // Menú
        while (!exit) {
            System.out.println();
            System.out.println("****** GESTION CINEMATOGRAFICA ********\n" +
                    "1-NUEVO ACTOR\n" +
                    "2-BUSCAR ACTOR\n" +
                    "3-ELIMINAR ACTOR\n" +
                    "4-MODIFICAR ACTOR\n" +
                    "5-VER TODOS LOS ACTORES\n" +
                    "6- VER PELICULAS DE LOS ACTORES\n" +
                    "7 - VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES\n" +
                    "8 - SALIR");
            // Comprueba si el usuario ingresó un número válido y llama al método correspondiente.
            try {
                option = scanner.nextInt();
                switch (option) {
                    case 1, 2, 3, 4, 5, 6, 7 -> Exercise15.exercise();
                    case 8 -> {
                        System.out.println("Saliendo...");
                        exit = true;
                    }
                    default -> System.out.println("OPCION INCORRECTO");
                }
            } catch (InputMismatchException e) {
                System.out.println("OPCION INCORRECTO");
                scanner.next();
            }
        }
        System.out.println("El programa ha finalizado.");
    }
}
