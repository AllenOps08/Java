public class quickSort {
   public static void main(String[] args) {
     int[] arr = {64,34,25,12,22,11,90};
     System.out.println("Original Array : ");
     printArray(arr);

     Sort(arr,0,arr.length-1);

     System.out.println("\nSorted Array");
     printArray(arr);

   }


   public static void Sort(int[] arr, int low,int high){
     
    // If the partition has more than one element
    if(low<high){
        int pivotIndex =  partition(arr,low,high);

        // Recursively sort the left subArray
        Sort(arr,low,pivotIndex-1);

        // Recursively sort the right subarray
        Sort(arr,pivotIndex+1,high);
    }
   }

   private static int partition(int[] arr, int low, int high){
        // Choose the rightmost element as pivot 
        int pivot = arr[high];

        // Index of smaller element
        int i = low - 1;

        // Traverse through the whole array
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++; 

                swap(arr,i,j);
            }
        }
        // Place the pivot in its correct position
        swap(arr,i+1,high);

        return i+1;
   }


   private static void swap(int[] arr, int i , int j){
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
   }


   private static void printArray(int[] arr){
     for (int i : arr) {
        System.out.print(i +  " ");
     }
     System.out.println();
   }
    
}