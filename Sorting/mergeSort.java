public class mergeSort {

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Original Array:");
        printArray(arr);
        
        Sort(arr);
        
        System.out.println("\nSorted Array:");
        printArray(arr);
    }

    public static void Sort(int[] arr){
        if(arr.length<2) return;

        // Find the middle point to divide the array into two halves
        int mid = arr.length/2;

        int[] left = new int[mid];
        int[] right = new int[arr.length-mid];

        // Populate left subarray
        for (int i = 0; i < mid; i++) {
            left[i] = arr[i];
        }

        // Populate right subarray
        for (int i = mid; i < arr.length; i++) {
            right[i-mid] = arr[i];
        }

        Sort(left);
        Sort(right);

        merge(arr, left, right);
    }

    public static void merge(int[] arr, int[] left, int[] right){
        int i=0,j=0,k=0; 
        
        while (i<left.length && j<right.length) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else{
                arr[k++] = right[j++];
            }
        }

        while (i<left.length) {
            arr[k++] = left[i++];
        }

        while (j<right.length) {
            arr[k++] = right[j++];
        }
    }

    public static void printArray(int[] arr){
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }






}

