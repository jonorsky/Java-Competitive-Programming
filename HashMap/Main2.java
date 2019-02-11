import java.util.HashMap;
import java.util.Scanner;

public class Main2{
  public static void main(String[] args){
    HashMap <String,Integer> hm = new HashMap<String, Integer>();
    hm.put("Philippines",1);

    System.out.println(hm.get("Philippines"));
  }
}
