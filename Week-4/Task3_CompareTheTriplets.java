public class Task3_CompareTheTriplets {

    public static int[] compareTriplets(int[] a, int[] b) {

        int alice = 0;
        int bob = 0;

        for (int i = 0; i < 3; i++) {

            if (a[i] > b[i]) {
                alice++;
            } else if (a[i] < b[i]) {
                bob++;
            }
        }

        return new int[]{alice, bob};
    }

    public static void main(String[] args) {

        int[] a = {5, 6, 7};
        int[] b = {3, 6, 10};

        int[] result = compareTriplets(a, b);

        System.out.println("Alice: " + result[0]);
        System.out.println("Bob: " + result[1]);
    }
}
