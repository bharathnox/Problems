//check if array is sorted
//non-descending
public class CheckSorted {
    static boolean check(int arr[] , int n) {
        boolean flag = true;
        for(int i=1; i<n; i++) {
            if(arr[i] >= arr[i-1]) {} else {
                flag = false;
                break;
            }
        }
        return flag;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,3,4,5,5,7};
        int n = arr.length;
        System.out.println(check(arr, n));
    }    
}
