public class UniformBinary {

    // Function to perform Uniform Binary Search
    public static int uniformBinarySearch(int[] arr, int target) {
        int n = arr.length;

        // Precompute the jump steps (powers of 2)
        int[] steps = new int[log2(n) + 1];
        steps[0] = n / 2;
        for (int i = 1; i < steps.length; i++) {
            steps[i] = steps[i - 1] / 2;
        }

        int pos = 0;  // starting position

        // Iterate through the jump steps
        for (int step : steps) {
            int mid = pos + step;

            // Ensure mid is within array bounds
            if (mid >= n) {
                continue;
            }

            // Compare target with the middle element
            if (arr[mid] == target) {
                return mid;  // Target found, return index
            } else if (arr[mid] < target) {
                pos = mid+1;  // Move to the right half
            }
            // Otherwise, automatically move to the left half by reducing the step
        }

        return -1;  // Target not found
    }

    // Helper function to calculate log base 2
    public static int log2(int n) {
        return (int) (Math.log(n) / Math.log(2));
    }

    // Main method to test the uniform binary search
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int target = 7;
        
        int result = uniformBinarySearch(arr, target);

        if (result != -1) {
            System.out.println("Element found at index " + result);
        } else {
            System.out.println("Element not found");
        }
    }
}