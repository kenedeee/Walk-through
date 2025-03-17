//2. Write a program to add two matrices.
public class guidedTask2{
    public static void main(String[] args) {
        int[][] matrix1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int[][] matrix2 = {
            {10, 11, 12},
            {15, 14, 13},
            {16, 17, 18}
        };
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] sumOfMatrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sumOfMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        System.out.println("Sum of matrices: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(sumOfMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}