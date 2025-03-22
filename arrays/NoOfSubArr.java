////finding the number of subarrays with given sum val K
// arr = {1,2,3,1,1,1,1,4,2,3} k = 3;
// NSA = {1,2}, {3}, {1,1,1}, {1,1,1}, {3}

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class NoOfSubArr {

    public static ArrayList<int[]> brute(int arr[], int n, int k) {
        ArrayList<int[]> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum+=arr[j];
                if(sum == k) {
                    int res[] = new int[j-i+1];
                    for (int l = 0; l < res.length; l++) {
                        res[l] = arr[i+l];
                    }
                    list.add(res);
                }
            }
        }
        return list;
    }

    public static ArrayList<int[]> optimal(int arr[], int n, int k) {
        // +ves and 0's only
        int left = 0, right = 0, sum = arr[0];
        ArrayList<int[]> list = new ArrayList<>();
        while (right < n) {
            while(sum > k && left <= right) {
                sum-=arr[left];
                left++;
            }
            if(sum == k) {
                int a[] = new int[right-left+1];
                for (int i = left; i <= right; i++) {
                    a[i - left] = arr[i];
                }
                list.add(a);
            }
            right++;
            if (right < n) sum+=arr[right];
        }
        return list;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,1,1,1,1,4,3,2};
        int n = arr.length;
        int k = 3;
        ArrayList<int[]> list = optimal(arr, n, k);
        for (int[] array : list) {
            for (int it : array) {
                System.out.print(it + " ");
            }
            System.out.println();
        }
    }
}
