import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main{
  public static void main(String[] args){
    List<String> list = new ArrayList<String>();
    list.add("a");
    list.add("b");
    list.add("c");

    for(int n=0; n<list.size(); n++){
      System.out.println(list.get(n));
    }
  
  }
}
