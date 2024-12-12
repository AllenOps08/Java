import java.util.Arrays; 

public class selectionSort {

    
    public static void Sort(int[] arr){
        int n = arr.length;

        for (int i = 0; i < n-1; i++) {
            int min_index = i ;

            for (int j = i+1; j < n; j++) {
                if(arr[j]<arr[min_index]){
                    min_index = j;
                }
            }

            int temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp ;
        }

        System.out.println("After Selection Sort : ");
        printArray(arr);
    }



    static void printArray(int[] arr){
        for(int val: arr){
            System.out.print(val + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        int[] arr = {64,25,12,22,11,56,34,23,78};

        System.out.print("Original Array: ");
        printArray(arr);

        Sort(arr);

    }
}