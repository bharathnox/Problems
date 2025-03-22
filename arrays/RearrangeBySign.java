//given an array of n/2 +ve elements and n/2 -ve elements n is always even,
// rearrange the elements so there are alternative +ves and -ves. With order maintained
// arr = {3,1,-2,-5,2,-4} +ves = {3,1,2} and -ves = {-2, -5, -4} ans = {3, -2, 1, -5, 2, -4}

import java.util.ArrayList;

public class RearrangeBySign {

    public static void myApproach(int arr[]) {
        int n = arr.length;
        int pos[] = new int[n/2];
        int neg[] = new int[n/2];
        int posPointer = 0, negPointer = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > 0) {
                pos[posPointer] = arr[i];
                posPointer++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < 0) {
                neg[negPointer] = arr[i];
                negPointer++;
            }
        }
        int idx = 0;
        for (int i = 0; i < n/2; i++) {
            arr[idx++] = pos[i];
            arr[idx++] = neg[i];
        }
    }

    public static void brute(int arr[]) {
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < 0) {
                neg.add(arr[i]);
            } else if(arr[i] > 0) {
                pos.add(arr[i]);
            }
        }
        for (int i = 0; i < arr.length/2; i++) {
            arr[2*i] = pos.get(i);
            arr[2*i+1] = neg.get(i);
        }
    }

    public static int[] optimal(int arr[]) {
        int ans[] = new int[arr.length];
        int pos = 0, neg = 1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < 0) {
                ans[neg] = arr[i];
                neg+=2;
            }
            if(arr[i] > 0) {
                ans[pos] = arr[i];
                pos+=2;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {3,1,-2,-5,2,-4};
        optimal(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
