import java.util.Scanner;
import java.lang.Math;

public class Main{
  public static void main(String[] args){
    double n = 6.425523;
    // Default Round Off
    System.out.println(Math.round(n));

    // Custom Round Off
    System.out.printf("%.3f",n);
  }
}
