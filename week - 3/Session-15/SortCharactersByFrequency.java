import java.util.*;

public class SortCharactersByFrequency {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        HashMap<Character, Integer> frequency =
            new HashMap<>();

        for (char c : s.toCharArray()) {

            frequency.put(
                c,
                frequency.getOrDefault(c, 0) + 1
            );
        }

        ArrayList<Character> chars =
            new ArrayList<>(frequency.keySet());

        chars.sort((a, b) ->
            frequency.get(b) - frequency.get(a)
        );

        StringBuilder result =
            new StringBuilder();

        for (char c : chars) {

            int count = frequency.get(c);

            for (int i = 0; i < count; i++) {
                result.append(c);
            }
        }

        System.out.println(result);

        sc.close();
    }
}
