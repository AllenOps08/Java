class Main{
    public static void main(String[] args) {
         int[] array1 = {10,20,30,40};
         int[] array2 = {5,10,15,20};


         System.out.println("Array Addition: ");
         int[] sumArray = arrayAddition(array1, array2);
         printIntArray(sumArray);

         System.out.println("\n Array Subtraction: ");
         int[] diffArray = arraySubtraction(array1, array2);
         printIntArray(diffArray);


         System.out.println("\nArray Multiplication: ");
         int[] productArray = arrayMultiplication(array1, array2);
         printIntArray(productArray);

         System.out.println("\n Array Division: ");
         double[] divArray = arrayDivision(array1,array2);
         printDoubleArray(divArray);
    }

    public static int[] arrayAddition(int[] arr1, int[] arr2){
        if(arr1.length != arr2.length){
            throw new IllegalArgumentException("Arrays must have the same length");
        }

        int[] result = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i] + arr2[i];
        }

        return result;
    }


    public static int[] arraySubtraction(int[] arr1, int[] arr2){
        if(arr1.length != arr2.length){
            throw new IllegalArgumentException("Arrays must have the same length");
        }

        int[] result = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i] - arr2[i];
        }

        return result;
    }


    
    public static int[] arrayMultiplication(int[] arr1, int[] arr2){
        if(arr1.length != arr2.length){
            throw new IllegalArgumentException("Arrays must have the same length");
        }

        int[] result = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i] * arr2[i];
        }

        return result;
    }

    
    public static double[] arrayDivision(int[] arr1, int[] arr2){
        if(arr1.length != arr2.length){
            throw new IllegalArgumentException("Arrays must have the same length");
        }

        double[] result = new double[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            if(arr2[i] == 0){
                throw new ArithmeticException("Cannot divide by zero");
            }
            result[i] = (double) arr1[i]/arr2[i];
        }

        return result;
    }


     // Method to print an integer array
     public static void printIntArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void printDoubleArray(double[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%.2f", arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
    
}