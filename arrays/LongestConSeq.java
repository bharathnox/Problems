// Longest Consecutive sequence, arr = {102,4,100,1,101,3,2,1,1}
// consecutive sequences are {100,101,102} and {1,2,3,4} ans = {1,2,3,4}

import java.util.Arrays;
public class LongestConSeq {

    public static boolean linearSearch(int arr[] , int num) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == num) {
                return true;
            }
        }
        return false;
    }

    public static int brute(int arr[]) {
        int longest = 1;
        for (int i = 0; i < arr.length; i++) {
            int x = arr[i];
            int cnt = 1;
            while (linearSearch(arr, x+1)) {
                x++;
                cnt++;
            }
            longest = Math.max(longest, cnt);
        }
        return longest;
    }

    public static int better(int arr[]) {
        if(arr.length == 0) return 0;
        int longest = 1;
        int lastSmall = Integer.MIN_VALUE;
        int cnt = 0;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]-1 == lastSmall) {
                lastSmall = arr[i];
                cnt++;
            } else if(arr[i] != lastSmall) {
                cnt = 1;
                lastSmall = arr[i];
            }
            longest = Math.max(longest, cnt);
        }
        return longest;
    }

    public static void main(String[] args) {
        int arr[] = {100,102,100,101,101,4,3,2,3,2,1,1,1,2};
        System.out.println(better(arr));
    }
}
