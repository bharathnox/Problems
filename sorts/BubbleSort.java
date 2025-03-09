public class BubbleSort {
	public static void main(String[] args) {
		int[] arr = { 18, 12, 5, 1, 6 };
		for (int i=0; i<arr.length; i++) {
		    for(int j=1; j<arr.length-i; j++){
		        if(arr[j-1] > arr[j]) {
		            int tmp = arr[j];
		            arr[j] = arr[j-1];
		            arr[j-1] = tmp;
		        }
		    }
		}
		for(int i=0; i<arr.length; i++) {
		    System.out.print(arr[i] + " ");
		}
	}
}