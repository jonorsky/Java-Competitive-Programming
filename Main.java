import java.util.Arrays;

public class Main{
  public static void main(String[] args){
    String[][] x = new String[5][2];
    String[][] y = new String[5][2];

    String z[][] = x;

    System.out.println(Arrays.deepEquals(z,y));
  }
}
