import java.util.*;


public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {13,46,24,52,20,9,89,78,47};
        Sort(arr);
    }

    public static void Sort(int[] arr){
        int n = arr.length;
        for (int i = n-1; i >=0 ; i--) {
            int didSwap =  0;

            for (int j = 0; j <= i-1 ; j++) {
                if (arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp ;
                    didSwap += 1;
                }
            }
            if(didSwap == 0) break ;
        }

        System.out.println("After bubble sort: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] +  " ");
        }
        System.out.println();
    }
}
