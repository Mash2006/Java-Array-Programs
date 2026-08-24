public class Task3_MaxSubarray {

    public static int maxSubarray(int[] arr) {

        int current = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {

            current = Math.max(arr[i], current + arr[i]);

            max = Math.max(max, current);
        }

        return max;
    }

    public static int maxSubsequence(int[] arr) {

        int sum = 0;
        int maxElement = arr[0];

        for (int num : arr) {

            if (num > 0) {
                sum += num;
            }

            maxElement = Math.max(maxElement, num);
        }

        if (sum == 0) {
            return maxElement;
        }

        return sum;
    }

    public static void main(String[] args) {

        int[] arr = {2, -1, 2, 3, 4, -5};

        System.out.println("Maximum Contiguous Sum: "
                + maxSubarray(arr));

        System.out.println("Maximum Non-Contiguous Sum: "
                + maxSubsequence(arr));
    }
}
