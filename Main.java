import java.util.Arrays;

public class Main{
  public static void main(String[] args){
    StringBuilder str[] = new StringBuilder[5];
    for(int i=0; i<str.length; i++){
      str[i] = new StringBuilder("" + i);
    }
    for(StringBuilder temp : str){
      System.out.println(temp);
    }
  }
}
