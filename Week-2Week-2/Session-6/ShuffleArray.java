import java.util.Scanner;

public class ShuffleArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[2 * n];

        for (int i = 0; i < 2 * n; i++) {
            nums[i] = sc.nextInt();
        }

        int[] result = new int[2 * n];
        int index = 0;

        for (int i = 0; i < n; i++) {
            result[index++] = nums[i];
            result[index++] = nums[i + n];
        }

        for (int i = 0; i < 2 * n; i++) {
            System.out.print(result[i] + " ");
        }

        sc.close();
    }
}