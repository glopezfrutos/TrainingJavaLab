package javalab;

import excercises.*;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Clase principal, contiene el menú para ver ejecutar los ejercicios.
 */
public class JavaLabMenu {
    /**
     * Main, menú principal
     * @param args none
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        int option;

        while (!exit) {
            System.out.println("\n*** MENÚ PRINCIPAL ***");
            System.out.println("Por favor, introduzca un número del 1 al 18 para ejecutar un ejercicio,");
            System.out.println("o introduzca 0 para salir.");
            // Comprueba si el usuario ingresó un número válido y llama al método correspondiente.
            try {
                option = scanner.nextInt();
                switch (option) {
                    case 0 -> {
                        System.out.println("Saliendo...");
                        exit = true;
                    }
                    case 1 -> Exercise01.exercise();
                    case 2 -> Exercise02.exercise();
                    case 3 -> Exercise03.exercise();
                    case 4 -> Exercise04.exercise();
                    case 5 -> Exercise05.exercise();
                    case 6 -> Exercise06.exercise();
                    case 7 -> Exercise07.exercise();
                    case 8 -> Exercise08.exercise();
                    case 9 -> Exercise09.exercise();
                    case 10 -> Exercise10.exercise();
                    case 11 -> Exercise11.exercise();
                    case 12 -> Exercise12.exercise();
                    case 13 -> Exercise13.exercise();
                    case 14 -> Exercise14.exercise();
                    case 15 -> Exercise15.exercise();
                    case 16 -> Exercise16.exercise();
                    case 17 -> Exercise17.exercise();
                    case 18 -> Exercise18.exercise();
                    default -> System.out.println("Elija una opción entre 1 y 18 o 0 para salir");
                }
            } catch (InputMismatchException e) {
                System.out.println("Por favor, elija una de las siguientes opciones para ordenarlos:");
                scanner.next();
            }
        }
        System.out.println("El programa ha finalizado.");
    }
}
