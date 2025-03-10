// progarm to find Kth smallest element in an array

public class KthSmall {
    
	public static void main(String[] args) {
		int[] arr = {18, 12, 5, 1, 6};
	    int kthSmallest = 4;
	    for(int i=0; i<arr.length; i++) {
            for(int j=i+1; j<arr.length; j++) {
                if(arr[i] > arr[j]){
                    int tmp = 0;
                    tmp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = tmp;
                }
            }
        }
        System.out.println(arr[kthSmallest - 1]);
	}
}