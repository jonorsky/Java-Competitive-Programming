import java.util.Scanner;
import java.util.Vector;
import java.util.Collections;

public class Main{

  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    Vector<String> vec = new Vector<String>();
    vec.add("Hello");
    vec.add("Hello1");
    
    debug(vec);

    vec.clear();

    vec.add("b");
    vec.add("a");

    debug(vec);

    Collections.sort(vec);

    debug(vec);
  }

  public static void debug(Vector<String> vec){
    for(int i=0; i<vec.size(); i++){
      System.out.print(vec.get(i) + " ");
    }
    System.out.println();
  }
}
