// find the maximum subarray sum arr = {-2, -3, 4, -1, -2, 1, 5, -3} ans = 7
// print the subarray with the maximum sum
public class MaxSubArrSum {

    public static int brute(int arr[], int n) {
        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum+=arr[k];
                }
                maxi = Math.max(maxi, sum);
            }
        }
        if (maxi < 0) maxi = 0; 
        return maxi;
    }

    public static int better(int arr[], int n) {
        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum+=arr[j];
                maxi = Math.max(maxi, sum);
            }
        }
        return maxi;
    }

    public static long optimal(int arr[], int n) {
        long maxi = Long.MIN_VALUE;
        long sum = 0;
        int ansStart = -1, ansEnd = -1, start = 0;
        for (int i = 0; i < arr.length; i++) {
            if(sum == 0) {
                start = i;
            }
            sum+=arr[i];
            if(sum > maxi) {
                maxi = sum;
                ansStart = start;
                ansEnd = i;
            }
            if(sum < 0) {
                sum = 0;
            }
        }
        for (int i = ansStart; i <= ansEnd; i++) {
            System.out.print(arr[i] + " ");
        }
        return maxi;
    }
    public static void main(String[] args) {
        int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        int n = arr.length;
        System.out.println("\n"+optimal(arr, n));
    }
}
