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
    byte x[] = new byte[4];
    for(byte i=0; i<4; i++){
      x[i] = i;
    }
    System.out.println();
    for(byte temp: x){
      System.out.println(temp);
    }
    String str = "test";
    for(int i=0; i<str.length(); i++){
      System.out.println(str.charAt(i));
    }
    StringBuilder sb = new StringBuilder("Hello World");
    sb.append(" Java");
    System.out.println(sb);
    sb.insert(1,"xx");
    System.out.println(sb);
    sb.replace(1,3,"");
    System.out.println(sb);
    String str1 = "GRF";
    StringBuilder strb = new StringBuilder(str1);
    System.out.println(strb);
  }
}
