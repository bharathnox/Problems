import java.util.HashMap;
import java.util.Map;

public class MajorityEle {

    public static int brute(int arr[], int n) {
        for (int i = 0; i < arr.length; i++) {
            int cnt = 0;
            for (int j = 0; j < arr.length; j++) {
                if(arr[i] == arr[j]) {
                    cnt++;
                }
            }
            if(cnt > n/2) {
                return arr[i];
            }
        }
        return -1;
    }

    public static int better(int arr[], int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int val = map.getOrDefault(arr[i], 0);
            map.put(arr[i], val+1);
        }

        for (Map.Entry<Integer, Integer> it : map.entrySet()) {
            if(it.getValue() > (n/2)) {
                return it.getKey();
            }
        }
        return -1;
    }

    public static int optimal(int arr[], int n) {
        // Moore's voting algo

        int ele = 0, cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if(cnt == 0) {
                ele = arr[i];
                cnt = 1;
            } else if(ele == arr[i]) {
                cnt++;
            } else {
                cnt--;
            }
        }
        int cnt1 = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == ele) {
                cnt1++;
            }
        }
        if(cnt1 > n/2) return ele;
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {2,3,3,3,1,3,2};
        int n = arr.length;
        System.out.print(optimal(arr, n));
    }
}
