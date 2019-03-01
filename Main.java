import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int sum = 0;
    int number;
    do {
      System.out.println("Enter a number: ");
      number = in.nextInt();
      if(number>0){
        sum += number;
      }
    }while(number>0);
    System.out.println("The sum is " + sum);
  }
}
