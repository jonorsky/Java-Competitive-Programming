class Person{
  public String name = "Edabun";
  void psg(){
    System.out.println("Hello from main class");
  }
}

public class Main extends Person{
  public void duh(){
    super.psg();
    System.out.println("Hello from subclass");

  }
  public static void main(String[] args){
    Main n = new Main();
    n.duh();
  }
}
