import java.util.*;

public class Session10_JavaHashSet {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        Set<String> set = new HashSet<>();

        for (int i = 0; i < t; i++) {

            String first = sc.next();
            String second = sc.next();

            String pair = first + " " + second;

            set.add(pair);

            System.out.println(set.size());
        }

        sc.close();
    }
}
