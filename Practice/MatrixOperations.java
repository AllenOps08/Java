public class MatrixOperations {
    public static int[][] createMatrix(int rows, int columns){
        return new int[rows][columns];
    }

    public static void printMatrix(int[][] matrix){
        for (int[] is : matrix) {
            for (int is2 : is) {
                System.out.print(is2 + " ");
            }
            System.out.println();
        }
    }


    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2){
        if(matrix1.length != matrix2.length || matrix1[0].length != matrix2[0].length){
            throw new IllegalArgumentException("Matrices must have same length ");
        }

        int rows = matrix1.length;
        int columns = matrix1[0].length;
        int[][] result = new int[rows][columns];


        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        return result;
    }
}
