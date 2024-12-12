import java.io.*;

public class LinearSearch {
   public static void main(String[] args) {
     int arr[] = {2,3,4,5,6,10,40};
     int x = 10;

     int result = search(arr, arr.length, x);
     System.out.println(result);

   }

   public static int search(int[] arr, int N, int x){
    for (int i = 0; i < N; i++) {
        if(arr[i]==x) return i;
    }
    return -1;
   }
    
}
