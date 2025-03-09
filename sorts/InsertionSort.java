public class InsertionSort {
	public static void main(String[] args) {
		int[] arr = { 18, 12, 5, 1, 6 };
        for (int i = 0; i<arr.length - 1; i++) {
            for (int j = i+1; j > 0; j--) {
                if (arr[j] < arr[j-1]) {
                    int tmp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = tmp;
                } else {
                    break;
                }
            }
        }
        for (int i=0; i < arr.length ; i++) {
            System.out.print(arr[i] + " ");
        } 
	}
}