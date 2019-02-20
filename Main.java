import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    int arr[] = new int[20];
    for(int i=0; i<5; i++){
      arr[i] = i;
    }
    for(int i: arr){
      System.out.println(i);
    }
  }
}
