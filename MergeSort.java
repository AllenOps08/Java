import java.util.Arrays;


public class MergeSort {
     /**
      * Main merge sort method that recursively divides and conquers the array
      */
      public static int[] mergeSort(int[] arr){

        if(arr.length <=1){
            return arr;
        }
         
        int L = arr.length;

        // Finding the middle point to divide the arr
        int mid = L/2;

        // Splitting the array into two halves

        //Copy of range in java is used to create a new array by copying a range of elements from a existing array
        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right   = Arrays.copyOfRange(arr, mid, L);


        // Recursively sort both halves until they become arrays of 1 elements
        left = mergeSort(left);
        right = mergeSort(right);

        return merge(left,right);
      }


      /**
       * Merge two sorted arrays into a single array
       */
    private static int[] merge(int[] left, int[] right){
        // Create a result array with total length of left and right
        int[] result = new int[left.length + right.length];

        //    Indices for left array , right array and result array
        int leftIndex=0 , rightIndex = 0, resultIndex = 0;

        //    Compare elements from both arrays and merge them in sorted order
        while (leftIndex<left.length && rightIndex < right.length) {
            if(left[leftIndex] <= right[rightIndex]){
                result[resultIndex++] = left[leftIndex++];
            } else{
                result[resultIndex++] = right[rightIndex++];
            }
        }

        // Copy remaining elements from left array, if any
        while(leftIndex<left.length){
            result[resultIndex++] = left[leftIndex++];
        }


        // Copy remaining elements from right array, if any
        while(rightIndex < right.length){
            result[resultIndex++] = right[rightIndex++];
        }

        return result;
    }


    /**
     * Demonstrates merge Sort
     */

     public static void main(String[] args) {
        int[] arr1 = {38,27,43,3,9,82,10};
        System.out.println("Original Array 1: " + Arrays.toString(arr1));
        int[] sortedArr1 = mergeSort(arr1);
        System.out.println("Sorted Array 1: "+ Arrays.toString(sortedArr1));

        int[] arr2 = {1,4,8,10,2,3,7,6,9,0,5};
        System.out.println("\nOriginal Array 2: " + Arrays.toString(arr2));
        int[] sortedArr2 = mergeSort(arr2);
        System.out.println("Sorted Array 2: "+ Arrays.toString(sortedArr2));

        // Test Case 3: Reverse sorted array
        int[] arr3 = {7, 6, 5, 4, 3, 2, 1};
        System.out.println("\nOriginal Array 3: " + Arrays.toString(arr3));
        int[] sortedArr3 = mergeSort(arr3);
        System.out.println("Sorted Array 3:   " + Arrays.toString(sortedArr3));
        
        // Test Case 4: Array with duplicate elements
        int[] arr4 = {64, 34, 25, 12, 22, 11, 90, 64};
        System.out.println("\nOriginal Array 4: " + Arrays.toString(arr4));
        int[] sortedArr4 = mergeSort(arr4);
        System.out.println("Sorted Array 4:   " + Arrays.toString(sortedArr4));
     }
}
