public class QuickSort {

    static void quickSort(int arr[], int low, int high) {
        if (low < high) {
            int pivotIdx = partition(arr, low, high);

            quickSort(arr, low, pivotIdx - 1);
            quickSort(arr, pivotIdx + 1, high);
        }
    }
    static int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = low-1;
        for (int j=low; j<high; j++) {
            if(arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;
        return i;
    }
    public static void main(String [] args) {
        int arr[] = { 18, 12, 5, 31, 1, 6 };
        quickSort(arr, 0, arr.length - 1);

        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}