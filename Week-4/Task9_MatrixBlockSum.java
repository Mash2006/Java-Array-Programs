import java.util.Arrays;

public class Task9_MatrixBlockSum {

    public static int[][] matrixBlockSum(int[][] mat, int k) {

        int rows = mat.length;
        int columns = mat[0].length;

        int[][] result = new int[rows][columns];

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < columns; j++) {

                int sum = 0;

                int rowStart = Math.max(0, i - k);
                int rowEnd = Math.min(rows - 1, i + k);

                int columnStart = Math.max(0, j - k);
                int columnEnd = Math.min(columns - 1, j + k);

                for (int r = rowStart; r <= rowEnd; r++) {

                    for (int c = columnStart; c <= columnEnd; c++) {

                        sum += mat[r][c];
                    }
                }

                result[i][j] = sum;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int k = 1;

        int[][] result = matrixBlockSum(matrix, k);

        for (int[] row : result) {
            System.out.println(Arrays.toString(row));
        }
    }
}
