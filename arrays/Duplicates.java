//remove duplicates and give number of unique elements

class Duplicates {
    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 2, 3, 4, 4, 4};
        int i=0;
        for(int j=i+1; j<arr.length; j++) {
            if(arr[i] != arr[j]) {
                arr[i+1] = arr[j];
                i++;
            }
        }
        System.out.println("unique = "+(i+1));
        for(int num : arr) {
            System.out.print(num+" ");
        }
    }
}