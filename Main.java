import java.util.Arrays;

public class Main{
  static void assignArray(int arr[]){
    arr[0] = 999;
    arr[1] = 888;
  }
  static void displayArray(int arr[]){
    for(int x : arr){
      System.out.println(x);
    }
  }

  public static void main(String[] args){
    int arr[] = new int[2];
    arr[0] = 1;
    arr[1] = 2;

    assignArray(arr);
    displayArray(arr);

    for(int x : arr){
      System.out.println(x);
    }
  }
}
