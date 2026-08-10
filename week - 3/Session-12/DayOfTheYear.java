import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.util.*;

public class DayOfTheYear {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String date = sc.next();

        LocalDate d = LocalDate.parse(date);

        int day = d.get(ChronoField.DAY_OF_YEAR);

        System.out.println(day);

        sc.close();
    }
}
