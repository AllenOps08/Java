public class SelectionSort {
    public static void sort(int a[]){
        int n = a.length;

        for(int i=0;i<n-1;i++){
            // Find the minimum element in unsorted array

            //e Assuming the current element is the smallest
            int min_idx = i;
 

            //e Inner loop to find the smallest element in the remaining unsorted part of the array
            for(int j=i+1;j<n;j++){
                if(a[j]< a[min_idx]) min_idx = j;
             }

             //Swap the found minimum element with the first element
             int temp = a[min_idx];
             a[min_idx] = a[i];
             a[i] = temp;
        }
    }


    public static void main(String[] args) {
        SelectionSort object = new SelectionSort();
        int a[] = {64,25,12,22,11};

        object.sort(a);

        int n = a.length;

        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}
