import java.util.Scanner;
import java.util.Vector;
import java.util.Collections;

public class Main{

  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    Vector<String> vec = new Vector<String>();

    // Add Elements in Vector
    vec.add("Hello");
    vec.add("Hello1");
    debug(vec);
    vec.clear();

    // Add New Elements in Vector
    vec.add("b");
    vec.add("a");
    debug(vec);

    // Sort the elements in vector
    Collections.sort(vec);
    debug(vec);

    // Sort the elements in reverse
    Collections.sort(vec,Collections.reverseOrder());
    debug(vec);
  }

  public static void debug(Vector<String> vec){
    for(int i=0; i<vec.size(); i++){
      System.out.print(vec.get(i) + " ");
    }
    System.out.println();
  }
}
