public class Task7_DiagonalDifference {

    public static int diagonalDifference(int[][] arr) {

        int n = arr.length;

        int primaryDiagonal = 0;
        int secondaryDiagonal = 0;

        for (int i = 0; i < n; i++) {

            primaryDiagonal += arr[i][i];

            secondaryDiagonal += arr[i][n - 1 - i];
        }

        return Math.abs(primaryDiagonal - secondaryDiagonal);
    }

    public static void main(String[] args) {

        int[][] matrix = {
            {11, 2, 4},
            {4, 5, 6},
            {10, 8, -12}
        };

        System.out.println(diagonalDifference(matrix));
    }
}
