import java.util.*;

public class JavaDateAndTime {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int month = sc.nextInt();
        int day = sc.nextInt();
        int year = sc.nextInt();

        Calendar calendar = Calendar.getInstance();

        calendar.set(year, month - 1, day);

        String[] days = {
            "SUNDAY",
            "MONDAY",
            "TUESDAY",
            "WEDNESDAY",
            "THURSDAY",
            "FRIDAY",
            "SATURDAY"
        };

        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

        System.out.println(days[dayOfWeek - 1]);

        sc.close();
    }
}
