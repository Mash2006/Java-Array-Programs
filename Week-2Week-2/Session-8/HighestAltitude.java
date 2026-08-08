import java.util.*;

public class Session8_HighestAltitude {

    public static int largestAltitude(int[] gain) {

        int altitude = 0;
        int highest = 0;

        for (int i = 0; i < gain.length; i++) {

            altitude += gain[i];

            highest = Math.max(highest, altitude);
        }

        return highest;
    }

    public static void main(String[] args) {

        int[] gain = {-5, 1, 5, 0, -7};

        System.out.println(largestAltitude(gain));
    }
}
