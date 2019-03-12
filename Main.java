import java.util.Scanner;
import java.util.ArrayList;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.util.StringTokenizer;

public class Main{
  public static void main(String[] args){

    File file = new File("C:\\Users\\Admin\\Desktop\\jav\\hey.txt");

    try{
    BufferedReader br = new BufferedReader(new FileReader(file));
    String st;
    while ((st = br.readLine()) != null){

      StringTokenizer st1 = new StringTokenizer(st, " ");
        while (st1.hasMoreTokens())
            System.out.print(st1.nextToken());

        System.out.println();
    }

    }catch(IOException e){

    }



  }
}
