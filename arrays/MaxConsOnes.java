/*  maximum consecutive ones 
 * arr[] = {1,1,0,0,'1,1,1',0,1,1,0}
 * there are 3 consecutive ones
 * in tose there are 3 maximum consecutive ones
*/

public class MaxConsOnes {

    public static int maxCons(int arr[], int n) {
        int count = 0;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 1) {
                count++;
            } else {
                count = 0;
            }
            max = Math.max(max, count);
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[] = {1,1,1,1,0,0,1,1,1,0,1,1,0};
        int n = arr.length;
        System.out.println(maxCons(arr, n));
    }
}
