import java.util.*;

public class Task2_LAPIN {

    public static boolean isLapindrome(String s) {

        int n = s.length();
        int[] left = new int[26];
        int[] right = new int[26];

        int mid = n / 2;

        for (int i = 0; i < mid; i++) {
            left[s.charAt(i) - 'a']++;
        }

        int start = (n % 2 == 0) ? mid : mid + 1;

        for (int i = start; i < n; i++) {
            right[s.charAt(i) - 'a']++;
        }

        return Arrays.equals(left, right);
    }

    public static void main(String[] args) {

        String s = "gaga";

        if (isLapindrome(s)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
