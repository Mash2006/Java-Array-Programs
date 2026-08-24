import java.util.*;

public class Task10_MatrixRotation {

    public static void rotateMatrix(int[][] matrix, int r) {

        int rows = matrix.length;
        int columns = matrix[0].length;

        int layers = Math.min(rows, columns) / 2;

        for (int layer = 0; layer < layers; layer++) {

            List<Integer> elements = new ArrayList<>();

            // Top row
            for (int j = layer; j < columns - layer; j++) {
                elements.add(matrix[layer][j]);
            }

            // Right column
            for (int i = layer + 1; i < rows - layer; i++) {
                elements.add(matrix[i][columns - layer - 1]);
            }

            // Bottom row
            for (int j = columns - layer - 2; j >= layer; j--) {
                elements.add(matrix[rows - layer - 1][j]);
            }

            // Left column
            for (int i = rows - layer - 2; i > layer; i--) {
                elements.add(matrix[i][layer]);
            }

            int size = elements.size();
            int rotation = r % size;

            int index = 0;

            // Top row
            for (int j = layer; j < columns - layer; j++) {
                matrix[layer][j] = elements.get((rotation + index) % size);
                index++;
            }

            // Right column
            for (int i = layer + 1; i < rows - layer; i++) {
                matrix[i][columns - layer - 1] =
                        elements.get((rotation + index) % size);
                index++;
            }

            // Bottom row
            for (int j = columns - layer - 2; j >= layer; j--) {
                matrix[rows - layer - 1][j] =
                        elements.get((rotation + index) % size);
                index++;
            }

            // Left column
            for (int i = rows - layer - 2; i > layer; i--) {
                matrix[i][layer] =
                        elements.get((rotation + index) % size);
                index++;
            }
        }
    }

    public static void main(String[] args) {

        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        int r = 2;

        rotateMatrix(matrix, r);

        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
