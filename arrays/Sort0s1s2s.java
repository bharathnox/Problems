// sort arr = {1,2,0,1,2,0,2,2,1,0}
import java.util.Arrays;
public class Sort0s1s2s {
    public static void brute(int arr[]) {
        Arrays.sort(arr);
    }

    public static void better(int arr[]) {
        int cnt0 = 0, cnt1 = 0, cnt2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0) {
                cnt0++;
            } else if(arr[i] == 1) {
                cnt1++;
            } else {
                cnt2++;
            }
        }
        for (int i = 0; i < cnt0; i++) {
            arr[i] = 0;
        }
        for (int i = cnt0; i < cnt0+cnt1; i++) {
            arr[i] = 1;
        }
        for (int i = cnt0+cnt1; i < arr.length; i++) {
            arr[i] = 2;
        }
    }

    static void swap(int arr[], int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public static void optimal(int arr[]) {
        // Dutch National Flag Algorithm
        int low = 0;
        int mid = 0;
        int high = arr.length-1;

        while (mid <= high) {
            if(arr[mid] == 0) {
                swap(arr, low, mid);
                low++;
                mid++;
            } else if(arr[mid] == 1) {
                mid++;
            } else if(arr[mid] == 2) {
                swap(arr, high, mid);
                high--;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {0,1,2,0,1,2,1,2,0,0,0,1};
        better(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
