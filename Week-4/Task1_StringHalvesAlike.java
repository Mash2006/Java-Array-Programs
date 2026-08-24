public class Task1_StringHalvesAlike {

    public static boolean halvesAreAlike(String s) {
        int mid = s.length() / 2;
        int firstCount = 0;
        int secondCount = 0;

        for (int i = 0; i < mid; i++) {
            if (isVowel(s.charAt(i))) {
                firstCount++;
            }
        }

        for (int i = mid; i < s.length(); i++) {
            if (isVowel(s.charAt(i))) {
                secondCount++;
            }
        }

        return firstCount == secondCount;
    }

    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);

        return ch == 'a' ||
               ch == 'e' ||
               ch == 'i' ||
               ch == 'o' ||
               ch == 'u';
    }

    public static void main(String[] args) {

        String s = "book";

        System.out.println(halvesAreAlike(s));
    }
}
