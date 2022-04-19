package excercises;

import java.util.Arrays;

public class Exercise06 {
    public static void exercise() {
        int index = 0;
        int odd[] = new int[50];
        for (int i = 0; i <= 100; i++) {
            if (isOdd(i)) {
                odd[index] = i;
                index++;
            }
        }
        System.out.println("A continuación, se muestran los números impares del 0 al 100:");
        System.out.println(Arrays.toString(odd));
    }

    public static boolean isOdd(int number) {
        return number % 2 == 1;
    }
}
