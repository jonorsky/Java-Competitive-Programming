import java.util.Scanner;
import java.util.ArrayList;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.util.StringTokenizer;
import java.io.InputStreamReader;

public class Main{
  public static void main(String[] args){
    File file = new File("C:\\Users\\Admin\\Desktop\\jav\\hey.txt");

    try{
      BufferedReader br = new BufferedReader(new FileReader(file));
      //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      String st;
      ArrayList<Integer> list = new ArrayList<Integer>();
      ArrayList<Integer> vec  = new ArrayList<Integer>();
      while ((st=br.readLine()) != null){
        StringTokenizer st1 = new StringTokenizer(st, " ");
        while (st1.hasMoreTokens()){
          list.add(Integer.parseInt(st1.nextToken()));
          //System.out.print(Integer.parseInt(st1.nextToken()));
        }
        vec.add(list.get(1));
        list.clear();
      }
      for(int x : vec)
        System.out.println(x);

      long sum=0;
      //if(list.size()%2!=0){
      //System.out.println(list.size());
      //  System.out.println(list.size()%2);
      //}
    //  System.out.println(list.get(1));


    }catch(IOException e){

    }



  }
}
