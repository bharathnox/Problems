public class Linear {

	static int linear(int[] arr, int target) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == target){
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] arr = {18, 12, 5, 1, 6};
	    int target = 5;
	    System.out.print(linear(arr, target));
	}
}