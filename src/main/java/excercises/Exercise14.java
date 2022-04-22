package excercises;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Exercise13 {
    public static void exercise() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println("Fecha y hora actual:\n"+ dtf.format(LocalDateTime.now()));
    }
}
