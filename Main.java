import java.util.Scanner;
import java.util.ArrayList;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;

public class Main{
  public static void main(String[] args){

    File file = new File("C:\\Users\\Admin\\Desktop\\jav\\hey.txt");

    try{
    BufferedReader br = new BufferedReader(new FileReader(file));
    String st;
    while ((st = br.readLine()) != null){
      System.out.println(st);
    }
    
    }catch(IOException e){

    }



  }
}
