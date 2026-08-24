import java.util.Arrays;

public class Task8_TransposeMatrix {

    public static int[][] transpose(int[][] matrix) {

        int rows = matrix.length;
        int columns = matrix[0].length;

        int[][] result = new int[columns][rows];

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < columns; j++) {

                result[j][i] = matrix[i][j];
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int[][] result = transpose(matrix);

        for (int[] row : result) {
            System.out.println(Arrays.toString(row));
        }
    }
}
