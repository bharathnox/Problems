public class InterpolationSearch {

    public static int interpolationSearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high && target >= arr[low] && target <= arr[high]) {
            // Estimate the position
            int pos = low + ((target - arr[low]) * (high - low)) / (arr[high] - arr[low]);

            // Check if the target is at pos
            if (arr[pos] == target) {
                return pos;
            }

            // If the target is larger, target is in the upper part
            if (arr[pos] < target) {
                low = pos + 1;
            } else {
                // If the target is smaller, target is in the lower part
                high = pos - 1;
            }
        }

        return -1; // Target not found
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int target = 3;

        int result = interpolationSearch(arr, target);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found.");
        }
    }
}
