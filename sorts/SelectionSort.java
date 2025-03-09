public class SelectionSort {
    public static void main(String [] args) {
        int arr[] = { 18, 12, 5, 1, 6};
        
        // ascending
        for (int i=0; i < arr.length - 1; i++) {
            int min_idx = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }
            int tmp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = tmp;
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        
        //descending
        for(int i=0; i<arr.length - 1; i++) {
            int max_idx = i;
            for(int j=i; j<arr.length; j++) {
                if(arr[j] > arr[max_idx]) {
                    max_idx = j;
                }
            }
            int tmp = arr[max_idx];
            arr[max_idx] = arr[i];
            arr[i] = tmp;
        }
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}