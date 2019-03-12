import java.util.Scanner;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    StringTokenizer token;
    BigInteger bg;
    String input,str1="",str2="";
    while(true){
      input = in.nextLine();
      token = new StringTokenizer(input);
      bg = new BigInteger("0");
      boolean flag = true;
      while(token.hasMoreTokens()){
        String psg = token.nextToken().toString();
        //System.out.println(token.nextToken().toString());
        if(flag==true)
          str1 = psg;
        else
          str2 = psg;
      }
      BigInteger val1 = new BigInteger("0");
      BigInteger val2 = new BigInteger("0");
      val1 = new BigInteger("232");
      val2 = new BigInteger("232");
      val1.add(val2);
    }

  }
}
