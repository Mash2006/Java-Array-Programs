public class Task2_BirthdayBar {

    public static int birthday(int[] chocolate, int day, int month) {

        int count = 0;

        for (int i = 0; i <= chocolate.length - month; i++) {

            int sum = 0;

            for (int j = i; j < i + month; j++) {
                sum += chocolate[j];
            }

            if (sum == day) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        int[] chocolate = {2, 2, 1, 3, 2};

        int day = 4;
        int month = 2;

        System.out.println("Number of ways: "
                + birthday(chocolate, day, month));
    }
}
