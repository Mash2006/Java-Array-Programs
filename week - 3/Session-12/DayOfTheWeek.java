import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class DayOfTheWeek {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int day = sc.nextInt();
        int month = sc.nextInt();
        int year = sc.nextInt();

        LocalDate date =
            LocalDate.of(year, month, day);

        String result =
            date.getDayOfWeek().toString();

        System.out.println(
            result.charAt(0) +
            result.substring(1).toLowerCase()
        );

        sc.close();
    }
}
