// find intersection of array

import java.util.ArrayList;

public class InterSecArr {

    public static ArrayList<Integer> optimal(int arr1[], int arr2[]) {
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0, j = 0;
        while (i<arr1.length && j<arr2.length) {
            if(arr1[i] < arr2[j]) {
                i++;
            } else if (arr2[j] < arr1[i]) {
                j++;
            } else {
                list.add(arr1[i]);
                i++;
                j++;
            }
        }
        return list;
    }

    public static ArrayList<Integer> brute(int arr1[], int arr2[]) {
        int visitedof2[] = new int[arr2.length];
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if(arr1[i] == arr2[j] && visitedof2[j] != 1) {
                    list.add(arr1[i]);
                    visitedof2[j] = 1;
                    break;
                }
                if(arr2[j] > arr1[i]) break;
            }
        }
        return list;
    }
    public static void main(String[] args) {
        int arr1[] = {1,2,2,3,3,4,5,6};
        int arr2[] = {2,3,3,5,6,6,7};
        ArrayList<Integer> list = optimal(arr1, arr2);
        System.out.print(list);
    }
}
