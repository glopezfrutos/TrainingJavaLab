package excercises;

/**
 * Ejercicio 1
 */
public class Exercise01 {
    /**
     * Llama por consola al método check con algunos valores arbitrarios como parámetro.
     */
    public static void exercise() {
        System.out.println("* Ejercicio 1 - Compararación de números *");
        System.out.println(check(3, 5));
        System.out.println(check(10, 5));
        System.out.println(check(10, 10));
    }

    /**
     * @param firstNumber  A partir de un primer número y
     * @param secondNumber un segundo número
     * @return devuelve un String con el resultado de la comparación de ambos números.
     */
    public static String check(int firstNumber, int secondNumber) {
        System.out.println("Comparando los números " + firstNumber + " y " + secondNumber + "...");
        if (firstNumber == secondNumber) {
            return "Los dos números son iguales.\n";
        }
        if (firstNumber > secondNumber) {
            return "El primer número es mayor que el segundo.\n";
        }
        return "El segundo número es mayor que el primero.\n";
    }
}
