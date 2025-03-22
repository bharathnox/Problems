// An element is said to be a leader if all the elements to the right of it are less than the element.
// arr[] = {10,22,12,3,0,6} leaders = {6,12,22}

import java.util.*;
public class Leaders {

    public static List<Integer> optimal(int arr[]) {
        List<Integer> list = new ArrayList<>();
        int leader = Integer.MIN_VALUE;
        for (int i = arr.length-1; i >= 0; i--) {
            if(arr[i] > leader) {
                leader = arr[i];
                list.add(leader);
            }
        }
        return list;
    }

    public static List<Integer> brute(int arr[]) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            boolean flag = true;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] < arr[j]) {
                    flag = false;
                    break;
                }
            }
            if(flag) {
                list.add(arr[i]);
            }
        }
        return list;
    }

     public static void main(String[] args) {
        int arr[] = {10,22,12,3,0,6};
        List<Integer> list = optimal(arr);
        System.out.println(list);
    }
}

