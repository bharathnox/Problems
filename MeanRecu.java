//mean using recursion

public class MeanRecu {
    
    static int sum(int[] arr, int i) {
        if(i >= arr.length) return -1;
        return arr[i] + sum(arr, i+1);
    }
    
	public static void main(String[] args) {
		int[] arr = { 18, 12, 5, 1, 6};
		int res = sum(arr, 0);
		System.out.print( (double) (res+1) / 5);
	}
}