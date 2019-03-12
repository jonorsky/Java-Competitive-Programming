import java.util.Scanner;
import java.util.ArrayList;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.util.StringTokenizer;
import java.io.InputStreamReader;
import java.util.Collections;

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
        }
        Collections.sort(list);
        vec.add(list.get(1));
        list.clear();
      }
      long sum=0;
      if(vec.size()%2 != 0){
        Collections.sort(vec);
        System.out.println(vec.get(vec.size()/2));
      }
      else{
        System.out.println( (  vec.get((vec.size()/2)-1) + vec.get(vec.size()/2)  ) / 2.0  );
      }
    }catch(IOException e){}
  }
}
