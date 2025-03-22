//finding the longest subarray with given sum val K
// arr = {1,2,3,1,1,1,1,4,2,3} k = 3;
// LSA = {1,1,1}

import java.util.HashMap;
import java.util.Map;

public class LongestSubArr {

    public static int brute1(int arr[], int n, int x) {
        int len = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                }
                if(sum == x) {
                    len = Math.max(len, j-i+1);
                }
            }
        }
        return len;
    }

    public static int brute2(int arr[], int n, int x) {
        int len = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum+=arr[j];
                if(sum == x) {
                    len = Math.max(len, j-i+1);
                } 
            }
        }
        return len;
    }

    public static int better(int arr[], int n, int k) {
        Map<Integer, Integer> preSumMap = new HashMap<>();
        int sum = 0;
        int maxLen = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];

            if(sum == k) {
                maxLen = Math.max(maxLen, i+1);
            }

            int rem = sum - k;

            if (preSumMap.containsKey(rem)) {
                int len = i - preSumMap.get(rem);
                maxLen = Math.max(maxLen, len);
            }

            if (!preSumMap.containsKey(sum)) {
                preSumMap.put(sum, i);
            }
            System.out.println(preSumMap);
        }
        return maxLen;
    }

    public static int optimal(int arr[], int n, int k) {
        // +ves and 0's only
        int left = 0, right = 0, maxLen = 0, sum = arr[0];
        while (right < n) {
            while(sum > k) {
                sum-=arr[left];
                left++;
            }
            if(sum == k) maxLen = Math.max(maxLen, right-left+1);
            right++;
            if (right < n) sum+=arr[right];
        }
        return maxLen;
    }
    
    public static void main(String[] args) {
        int arr[] = {1,2,3,1,1,1,1,4,2,3};
        int n = arr.length;
        int k = 6;
        System.out.println(optimal(arr, n, k));
    }
}