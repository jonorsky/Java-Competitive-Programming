import java.io.*;
import java.util.*;

class Main{
  static void stack_push(Stack<Integer> stack){
    for(int i=0; i<5; i++){
      stack.push(i);
    }
  }

  static void print_top(Stack<Integer> stack){
      System.out.println(stack.peek());
  }

  static void delete_top(Stack<Integer> stack){
    stack.pop();
  }

  public static void main(String[] args){
    Stack<Integer> arr = new Stack<Integer>();
    stack_push(arr);
    print_top(arr);
    delete_top(arr);
    print_top(arr);
  }
}
