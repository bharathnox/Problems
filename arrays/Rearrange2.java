//given an array of n elements with +ve and -ve numbres (No guarantee that both will be in equal number)
// rearrange the elements so there are alternative +ves and -ves. With order maintained.
// If elements left out add those to end.
// arr = {1,2,-4,-5,3,6} +ves = {1,2,3,6} and -ves = {-4,-5} ans = {1,-4,2,-5,3,6}

import java.util.ArrayList;
public class Rearrange2 {

    public static int[] brute(int arr[]) {
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < 0) {
                neg.add(arr[i]);
            }
            if(arr[i] > 0) {
                pos.add(arr[i]);
            }
        }
        int lenMin = Math.min(pos.size(), neg.size());
        for (int i = 0; i < lenMin; i++) {
            arr[2*i] = pos.get(i);
            arr[2*i+1] = neg.get(i);
        }
        if(pos.size() > neg.size()) {
            int idx = 2*lenMin;
            for (int i = lenMin; i < pos.size(); i++) {
                arr[idx] = pos.get(i);
                idx++;
            }
        } else if(pos.size() < neg.size()) {
            int idx = 2*lenMin;
            for (int i = lenMin; i < neg.size(); i++) {
                arr[idx] = neg.get(i);
                idx++;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,-4,-5,3,6};
        brute(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}