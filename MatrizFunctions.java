public class MatrizFunctions {
    public static int sumLinha(int[][] matrix, int row) {
        int sum = 0;
        for (int j = 0; j < matrix[row].length; j++) {
            sum += matrix[row][j];
        }
        return sum;
    }

    public static int sumColuna(int[][] matrix, int col) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][col];
        }
        return sum;
    }

    public static int sumMainDiagonal(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
        }
        return sum;
    }

    public static int sumSecDiagonal(int[][] matrix) {
        int sum = 0;
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            sum += matrix[i][n - 1 - i];
        }
        return sum;
    }
}