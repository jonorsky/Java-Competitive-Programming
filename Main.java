import java.util.ArrayList;

public class Main{
  public static void main(String[] args){
    ArrayList<String> creatures = new ArrayList<String>();
    creatures.add("Mutant");
    creatures.add("Hello World");
    creatures.add(1,"Human");
    System.out.println(creatures);

    ArrayList<String> cuddles = new ArrayList<String>();
    cuddles.add("1");
    cuddles.add("2");

    creatures.addAll(2,cuddles);
    System.out.println(creatures);
  }
}
