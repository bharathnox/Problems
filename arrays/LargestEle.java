//find largest in array

//brute - sort and return last element

//optimal
class LargestEle {
  public static void main(String [] args) {
    int arr[] = {3,4,1,5,8,2,4,2};
    int lar = arr[0];
    for(int i=1; i<arr.length; i++) {
      if(arr[i] > lar) {
        lar = arr[i];
      }
    }
    System.out.println("Largest is: " + lar);
  }
}