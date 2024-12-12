public class insertionSort {
    public static void main(String[] args) {
        int arr[] = {12,45,67,90,89,25,43,86};
        Sort(arr);
    }

    public static void Sort(int[] arr){
        int n = arr.length; 
        for (int i = 0; i <= n-1; i++) {
            int j = i;
            while (j>0 && arr[j-1] > arr[j]) {
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }

        for (int i = 0; i <n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
