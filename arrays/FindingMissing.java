// find the missing ele in arr of 1 to n numbers

public class FindingMissing {


    public static int brute(int arr[]) {
        for (int i = 1; i <= arr.length ; i++) {
            boolean flag = false;
            for (int j = 0; j < arr.length; j++) {
                if(arr[j] == i) {
                    flag = true;
                }
            }
            if(!flag) {
                return i;
            }
        }
        return -1;
    }

    public static int better(int []a, int N) {

        int hash[] = new int[N + 1];

        for (int i = 0; i < N; i++) {
            hash[a[i]]++;
        }

        for (int i = 1; i <= N; i++) {
            if (hash[i] == 0) {
                return i;
            }
        }
        return -1;
    }

    public static int optimalOwnSol(int arr[]) {
        int ans = -1;
        for (int i = 0; i < arr.length; i++) {
            if(i == arr.length-1) return ans;
            if(arr[i+1] > arr[i] && arr[i+1] == arr[i]+1) {} else{
                ans = arr[i]+1;
                return ans;
            }
        }
        return ans;
    }

    public static int optimalSummation(int arr[], int n) {
        int sum = (n * (n+1)) / 2;
        int sum1 = 0;
        for (int i = 0; i < arr.length; i++) {
            sum1+=arr[i];
        }
        System.out.println(sum);
        System.out.println(sum1);
        if((sum-sum1) == 0) return -1;
        return sum-sum1;
    }

    public static int optimalXOR(int arr[], int n) {
        int xor1 = 0;
        int xor2 = 0;
        for (int i = 0; i < n-1; i++) {
            xor1 = xor1^(i + 1);
            xor2 = xor2^arr[i];
        }
        xor1 = xor1^n;
        return (xor1^xor2) == 0 ? -1 : xor1^xor2;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,4,5};
        int n = 5;
        System.out.println(optimalXOR(arr, n));
    }
}
