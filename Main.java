import java.util.ArrayList;

class Book{
  public String title;
}

class Library{
  private ArrayList<Book> books = new ArrayList<Book>();

  public Book getBook(int index){
    return books.get(index);
  }
}

public class Main{
  public static void main(String[] args){

  }
}
