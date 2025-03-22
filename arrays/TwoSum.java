// arr = [2,6,8,5,11], target = 6

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public static int[] brute(int arr[], int n, int k) {
        int ans[] = new int[2];
        ans[0] = ans[1] = -1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] + arr[j] == k) {
                    ans[0] = i;
                    ans[1] = j;
                    return ans;
                }
            }
        }
        return ans;
    }

    public static int[] optimal(int arr[], int n, int k) {
        int ans[] = new int[2];
        ans[0] = ans[1] = -1;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int moreNeeded = k - arr[i];
            if(map.containsKey(moreNeeded)) {
                ans[1] = i;
                ans[0] = map.get(moreNeeded);
                return ans;
            }
            map.put(arr[i], i);
        }
        return ans;
    }

    public static int[] better(int arr[], int n, int k) {
        int ans[] = new int[2];
        ans[0] = ans[1] = -1;
        Arrays.sort(arr);
        int left = 0, right = n-1;
        while(left < right) {
            if(arr[left] + arr[right] > k) {
                right--;
            } else if(arr[left] + arr[right] < k) {
                left++;
            } else {
                ans[0] = left;
                ans[1] = right;
                return ans;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {2,6,8,5,11};
        int n = arr.length;
        int target = 10;
        int a[] = optimal(arr, n, target);
        for (int i : a) {
            System.out.print(i + " ");
        }
    }
}
