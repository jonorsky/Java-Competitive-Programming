import java.util.Scanner;

class Employee{
  private String name;
  private int age;

  public int getAge(){
    return age;
  }

  public void setAge(int age){
    this.age = age;
  }
}

public class Main{
  public static void main(String[] args){
    Employee n = new Employee();
    n.setAge(1);
  }
}
