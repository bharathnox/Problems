//Given array with all the numbers twice except one. Find that number

public class AppearedOnce {

    public static int appearedOnce(int arr[], int n) {
        //works only for sorted arrays
        int i;
        for (i = 0; i < arr.length-1; i++) {
            if(arr[i] == arr[i+1]) {
                i++;
            } else {
                return arr[i];
            }
        }
        return i < n ? arr[i] : -1;
    }

    public static int brute(int arr[], int n) {
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if(arr[j] == arr[i]) {
                    count++;
                }
            }
            if(count == 1) {
                return arr[i];
            }
        }
        return -1;
    }

    public static int better(int arr[], int n) {
        int maxi = arr[0];
        for (int i = 0; i < arr.length; i++) {
            maxi = Math.max(maxi, arr[i]);
        }
        int hash[] = new int[maxi];
        for (int i = 0; i < arr.length; i++) {
            hash[arr[i]]++;
        }
        for (int i = 0; i < hash.length; i++) {
            if(hash[i] == 1) return hash[i];
        }
        return -1;
    }

    public static int optimal(int arr[], int n) {
        int xor = 0;
        for (int i = 0; i < arr.length; i++) {
            xor = xor^arr[i];
        }
        return xor;
    }
    public static void main(String[] args) {
        int arr[] = {1,3,1,2,4,2,4};
        int n = arr.length;
        System.out.println(optimal(arr, n));
    }
}