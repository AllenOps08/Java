public class TwoDArrayOperations {
    public static void main(String[] args) {
        int[][] matrix1 = {
            {10,20,30},
            {40,50,60},
            {70,80,90}
        };

        int[][] matrix2 = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
   
        // Demonstrate Element-wise Addition
        System.out.println("2D Array Addition:");
        int[][] sumMatrix = array2DAddition(matrix1, matrix2);
        print2DIntArray(sumMatrix);

        System.out.println("\n2D Array Subtraction:");
        int[][] diffMatrix = array2DSubtraction(matrix1, matrix2);
        print2DIntArray(diffMatrix);
 
        System.out.println("\n2D Array Multiplication:");
        int[][] prodMatrix = array2DMultiplication(matrix1, matrix2);
        print2DIntArray(prodMatrix);

        // Demonstrate Element-wise Division
         System.out.println("\n2D Array Division:");
         double[][] divMatrix = array2DDivision(matrix1, matrix2);
         print2DDoubleArray(divMatrix);
    }


    public static int[][] array2DAddition(int[][] matrix1, int[][] matrix2){
        if(matrix1.length != matrix2.length || matrix1[0].length != matrix2[0].length){
            throw new IllegalArgumentException("Matrices must have the same dimension");
        }

        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] result = new int[rows][cols];


        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        return result;
    }

    public static int[][] array2DSubtraction(int[][] matrix1, int[][] matrix2){

        int rows  = matrix1.length;
        int cols = matrix1[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        return result;
    }


    public static int[][] array2DMultiplication(int[][] matrix1, int[][] matrix2){
        if(matrix1.length != matrix2.length ||   matrix1[0].length != matrix2[0].length){   
                throw new IllegalArgumentException("Matrices must have the same dimensions");
        }


        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] * matrix2[i][j];
            }
        }
        return result;
    }

    public static double[][] array2DDivision(int[][] matrix1, int[][] matrix2){
        if(matrix1.length != matrix2.length || matrix1[0].length != matrix2[0].length){
            throw new IllegalArgumentException("Matrices must have same dimension");
        }

        int rows = matrix1.length;
        int cols = matrix1[0].length;

        double[][] result = new double[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <cols; j++) {
                if(matrix2[i][j] ==0){
                    throw new ArithmeticException("Cannot divide by zero");
                }
                result[i][j] = (double) matrix1[i][j] / matrix2[i][j];
            }
        }
        return result;

    }


  



    public static void print2DIntArray(int[][] arr){
        for (int[] row : arr) {
            for (int val : row) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }
    }

    public static void print2DDoubleArray(double[][] arr){
        for (double[] row : arr) {
            for  (double val : row) {
                System.out.printf("%.2f\t", val);
            }
            System.out.println();
        }
    }


    
}
