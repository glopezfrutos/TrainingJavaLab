package excercises;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise05 {
    public static void exercise() {
        int i = 0;
        int index = 0;
        int odd[] = new int[50];
        while (i <= 100) {
            if (isOdd(i)) {
                odd[index] = i;
                index++;
            }
            i++;
        }
        System.out.println("A continuación, se muestran los números impares del 0 al 100:");
        System.out.println(Arrays.toString(odd));
    }

    public static boolean isOdd(int number) {
        return number % 2 == 1;
    }
}
