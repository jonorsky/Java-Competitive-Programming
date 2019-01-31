import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

public class Main{
  public static void main(String[] args){
    HashMap <String,Integer> hm = new HashMap<String,Integer>();
    // Put Data in HashMap
    hm.put("Kuala Lumpur",1);
    hm.put("Japan",2);
    // Retrieve Data in HashMap
    System.out.println(hm.get("Japan"));

    // Iterate Data in Hashmap
    Iterator it = hm.entrySet().iterator();
    while (it.hasNext()) {
      Map.Entry pair = (Map.Entry)it.next();
      System.out.println(pair.getKey() + "=" + pair.getValue());
      it.remove();
    }
    // Clear HashMap
    hm.clear();
  }
}
