// move all zeroes to the end

import java.util.ArrayList;

public class MoveZero {

    public static void brute(int arr[], int n) {
        //add non zeroes to temp
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if(arr[i] != 0) {
                temp.add(arr[i]);
            }
        }

        //add temp to arr
        for (int i = 0; i < temp.size(); i++) {
            arr[i] = temp.get(i);
        }

        //make rest as zeroes
        for (int i = temp.size(); i < n; i++) {
            arr[i] = 0;
        }
    }

    public static void optimal(int arr[], int n) {
        int j = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0) {
                j = i;
                break;
            }
        }
        for (int i = j+1; i < n; i++) {
            if(arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,0,2,0,3,0};
        int n = arr.length;
        optimal(arr, n);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
