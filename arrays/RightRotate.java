//Right rotate an array by 'D' places

public class RightRotate {

    public static void brute(int arr[], int n, int d) {
        d = d % n;
        int temp[] = new int[d]; 
        for(int i=n-d; i<n; i++) {
            temp[i-(n-d)] = arr[i];
        }

        for (int i = 0; i < n-d; i++) {
            arr[i+d] = arr[i];
        }

        for (int i = 0; i < d; i++) {
            arr[i] = temp[i];
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int n = arr.length;
        int d = 4;
        brute(arr, n, d);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}