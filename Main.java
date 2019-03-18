import java.io.IOException;

public class Main{
  public static void main(String[] args){
    try{
      throw new Exception();
    }catch(Exception e){}
  }
}
