import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Vector;
import java.util.Collections;
import java.util.Arrays;

public class Main{

public static String sort(String str){
  char temp[] = str.toCharArray();
  Arrays.sort(temp);
  return new String(temp);
}

  public static void main(String[] args){
    Vector<String> vec = new Vector<String>();
    Scanner in = new Scanner(System.in);
    String str;
    int t;
    t = in.nextInt();
    in.nextLine();
    while(t-->0){
      str = in.nextLine();
      StringTokenizer st = new StringTokenizer(str);
      while (st.hasMoreTokens()) {
        vec.add(sort(st.nextToken()));
      }

      if(vec.get(0).equals(vec.get(1)))
        System.out.println("YES");
      else
        System.out.println("NO");

      vec.clear();
    }
  }
}
