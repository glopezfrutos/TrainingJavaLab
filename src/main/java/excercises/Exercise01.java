package excercises;

public class Exercise01 {
    public static void exercise() {
        System.out.println("A continuación, se compararán dos números:");
        System.out.println(check(3, 5));
        System.out.println("A continuación, se compararán dos números:");
        System.out.println(check(10, 5));
        System.out.println("A continuación, se compararán dos números:");
        System.out.println(check(10, 10));
    }

    public static String check(int firstNumber, int secondNumber) {
        System.out.println("Eligió los números " + firstNumber + " y " + secondNumber + ". ");
        if (areEqual(firstNumber, secondNumber)) {
            return "Los dos números son iguales.\n";
        }
        return greater(firstNumber, secondNumber);
    }

    public static boolean areEqual(int firstNumber, int secondNumber) {
        return firstNumber == secondNumber;
    }

    public static String greater(int firstNumber, int secondNumber) {
        if (isGreater(firstNumber, secondNumber)) {
            return "El primer número es mayor que el segundo.\n";
        }
        return "El segundo número es mayor que el primero.\n";
    }

    public static boolean isGreater(int firstNumber, int secondNumber) {
        return firstNumber > secondNumber;
    }
}
