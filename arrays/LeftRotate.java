// Left rotate an array by 'D' places

class LeftRotate{
    
    // time complexity: o(d) + o(n-d) + o(d) = o(n+d);
    // space complexity: extra space - o(d);
    public static void brute(int[] arr, int n, int d) {
        d = d % n;
        int temp[] = new int [d];
        for(int i=0; i<d; i++) {
            temp[i] = arr[i];
        }

        for(int i=d; i<n; i++) {
            arr[i-d] = arr[i];
        }

        for(int i=n-d; i<n; i++) {
            arr[i] = temp[i-(n-d)];
        }
    }

    public static void reverse(int arr[], int start, int end) {
        while (start<=end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void optimal(int[] arr, int n, int d) {
        reverse(arr, 0, d-1);
        reverse(arr, d, n-1);
        reverse(arr, 0, n-1);
    }

    public static void main(String [] args) {
        int arr[] = {1,2,3,4};
        int n = arr.length;
        int d = 1;
        // brute(arr, n, d);
        optimal(arr, n, d);
        for(int i : arr) {
            System.out.print(i + " ");
        }
    }
}