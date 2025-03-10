//given two sorted arrays, union the arrays and return new array

import java.util.ArrayList;
import java.util.HashSet;

public class UnionArr {

    public static ArrayList<Integer> optimal(int arr1[], int arr2 []) {
        ArrayList<Integer> list = new ArrayList<>();
        int n = arr1.length, m = arr2.length, i = 0, j = 0;

        while (i<n && j<m) {
            if(arr1[i] < arr2[j]) {
                if(list.size() == 0 || !list.contains(arr1[i])) {
                    list.add(arr1[i]);
                }
                i++;
            } else {
                if(list.size() == 0 || !list.contains(arr2[j])) {
                    list.add(arr2[j]);
                }
                j++;
            }
        }

        while (j<m) {
            if(list.size() == 0 || !list.contains(arr2[j])) {
                list.add(arr2[j]);
            }
            j++;
        }


        while (i<n) {
            if(list.size() == 0 || !list.contains(arr1[i])) {
                list.add(arr1[i]);
            }
            i++;
        }

        return list;
    }

    public static ArrayList<Integer> brute(int arr1[], int arr2[]) {
        HashSet<Integer> s = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {
            s.add(arr1[i]);
        }

        for (int i = 0; i < arr2.length; i++) {
            s.add(arr2[i]);
        }

        for (int it : s) {
            list.add(it);
        }
        return list;
    }
    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4, 5};
        int arr2[] = {3, 4, 5, 6, 7};
        ArrayList<Integer> union = optimal(arr1, arr2);
        for (int val : union) {
            System.out.print(val + " ");
        }
    }
}
