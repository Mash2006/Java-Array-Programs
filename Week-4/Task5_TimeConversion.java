public class Task5_TimeConversion {

    public static String timeConversion(String s) {

        String period = s.substring(8, 10);
        int hour = Integer.parseInt(s.substring(0, 2));

        if (period.equals("AM")) {

            if (hour == 12) {
                hour = 0;
            }

        } else {

            if (hour != 12) {
                hour += 12;
            }
        }

        return String.format("%02d", hour) + s.substring(2, 8);
    }

    public static void main(String[] args) {

        String time = "07:05:45PM";

        System.out.println(timeConversion(time));
    }
}
