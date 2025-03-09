// find second largest
import java.util.*;

class SecLar {

  public static int brute(int[] arr) {
    System.out.print("brute ");
    int n = arr.length;
    Arrays.sort(arr);
    int secLar = -1;
    int lar = arr[n-1];
    for(int i=n-2; i>=0; i--) {
      if(arr[i] != lar) {
        secLar = arr[i];
        break;
      }
    }
    return secLar;
  }

  public static int better(int[] arr) {
    System.out.print("better ");
    int n = arr.length, lar = arr[0], secLar = -1;
    for(int i=1; i<n; i++) {
      if(arr[i] > lar) {
        lar = arr[i];
      }
    }
    for(int i=0; i<n; i++) {
      if(arr[i] > secLar && arr[i] != lar) {
        secLar = arr[i];
      }
    }
    return secLar;
  }

  public static int optimal(int[] arr) {
    System.out.print("optimal ");
    int n = arr.length, lar = arr[0], secLar = -1;
    for(int i=1; i<n; i++) {
      if(arr[i] > lar) {
        secLar = lar;
        lar = arr[i];
      } else if(arr[i] < lar && arr[i] > secLar) {
        secLar = arr[i];
      }
    }
    return secLar;
  }

  public static void main(String [] args) {
    int arr[] = {3,4,1,5,8,2,4,2};
    System.out.println(optimal(arr));
    System.out.println(better(arr));
    System.out.print(brute(arr));

  }
}
