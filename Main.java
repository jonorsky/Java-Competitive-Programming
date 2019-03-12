import java.util.Scanner;
import java.util.ArrayList;

public class Main{
  public static void main(String[] args){
    Scanner in = new Scanner("C:\\Users\\Admin\\Desktop\\jav");
    int x,y,z;
    ArrayList<Integer> list = new ArrayList<Integer>();
    do{
      x = in.nextInt();
      y = in.nextInt();
      z = in.nextInt();
      list.add(y);
      System.out.println(x + " " + y + " " + z);
    } while(in.hasNextInt());

    for(int xx : list){
      System.out.println(xx);
    }

  }
}
