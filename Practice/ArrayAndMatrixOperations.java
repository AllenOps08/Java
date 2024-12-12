import java.util.* ;

public class ArrayAndMatrixOperations {
    
    //a.  Merging two arrays
    public static int[] mergeTwoArrays(int[] arr1, int[] arr2){
        int[] mergedArray = new int[arr1.length + arr2.length];

        // Copy first array
        System.arraycopy(arr1, 0, mergedArray, 0, arr1.length);

        // Copy second array
        System.arraycopy(arr2, 0, mergedArray, arr1.length,arr2.length);

        return mergedArray;
    }

    // b. Rotate an array by 2 positions to the right 
    public static int[] rotateArray(int[] array, int positions){
        int n = array.length;
        // Handle cases where rotation > array length
        positions = positions%n; 

        // Create a new array to store rotated elements
        int[] rotatedArray = new int[n];

        // Copy rotated elements
        for (int i = 0; i < n; i++) {
            rotatedArray[i] = array[(i-positions+n)%n];
        }

        return rotatedArray;
    }

    public static int[] deleteElement(int[] arr, int index){
        if(index<0 || index >= arr.length){
            throw new IndexOutOfBoundsException("Invalid Index");
        }

        // Create a new array with one less element
        int[] newArray = new int[arr.length-1];

        // Copy elements before the index
        System.arraycopy(arr, 0, newArray, 0, index);

        // Copy elements after the index
        System.arraycopy(arr, index+1, newArray, index, arr.length);

        return newArray;
    }







}
