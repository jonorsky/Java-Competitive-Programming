import java.util.Scanner;

class Main{
  static void poly(int x){
    System.out.println(x + "Its Integer!");
  }

  static void poly(double x){
    System.out.println( x + "Its Double!");
  }

  static void poly(char x){
    System.out.println(x + "Its character!");
  }

  static void poly(String x){
    System.out.println("Its String!");
  }

  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int x = 123;
    double y = 2.32;
    char z = 'A';

      poly(x);
      poly(y);
      poly(z);

  }
}
