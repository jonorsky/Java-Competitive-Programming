import java.util.Scanner;

public class Main extends Thread{
  public void run(){
    System.out.println("My thread is in running state!");
  }

  public static void main(String[] args){
    Main obj = new Main();
  }
}
