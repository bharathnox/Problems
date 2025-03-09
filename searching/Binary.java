public class Binary{

    static int binary(int[] arr, int target) {
        int start = 0, end = arr.length - 1;
        while(start <= end) {
            int mid = start + (end - start)/2;
            if (target == arr[mid]) {
                return mid;
            }
            if(target < arr[mid]) {
                end = mid - 1;
            }
            if(target > arr[mid]) {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String [] args) {
        int[] arr = { 1, 5, 6, 12, 18};
        int target = 18;
        System.out.print(binary(arr, target));
    }
}