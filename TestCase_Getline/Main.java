import java.util.Scanner;
import java.io.InputStream;

public class Main{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int t,n;
    String str;
    t = in.nextInt();
    in.nextLine(); // Consume enter key press
    while(t-->0){
      str = in.nextLine();
      System.out.println(str);
    }
  }
}
