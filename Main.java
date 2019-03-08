class Person{
  private int age;

  public void setAge(final int age){
    this.age = 4;
  }

  public int getAge(){
    return age;
  }
}

public class Main{
  public static void main(String[] args){
    Person n = new Person();
    int x = 5;
    n.setAge(x);
    System.out.println(n.getAge());
  }
}
