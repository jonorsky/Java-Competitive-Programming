class Person{
  String name;
}

public class Main{
  public static void main(String[] args){
    Person names[] = new Person[5];
    names[0] = new Person();
    names[0].name = "Edbert";
    System.out.println(names[0].name);
  }
}
