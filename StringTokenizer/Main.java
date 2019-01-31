import java.util.Scanner;
import java.util.StringTokenizer;

public class Main{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    String str;
    int t;
    t = in.nextInt();
    in.nextLine();
    while(t-->0){
      str = in.nextLine();
      StringTokenizer st = new StringTokenizer(str);
      while (st.hasMoreTokens()) {
        System.out.println(st.nextToken());
      }
    }
  }
}
