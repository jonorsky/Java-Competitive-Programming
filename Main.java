import java.util.ArrayList;

public class Main{
  public static void main(String[] args){
    ArrayList<String> list = new ArrayList<String>();
    list.add("dog");
    list.add("cat");

    System.out.println(list.indexOf("cat"));
    System.out.println(list.contains("cat"));
  }
}
