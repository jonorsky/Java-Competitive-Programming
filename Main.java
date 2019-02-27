import java.util.ArrayList;

class Book{
  public String title;
}

class Library{
  private ArrayList<Book> books = new ArrayList<Book>();

  public Book getBook(int index){
    return books.get(index);
  }

  public void addBook(Book book){
    books.add(book);
  }

  public List getBooks(){
    ArrayList list = new ArrayList(books.size());
    for(Book book : books){
      list.add(new Book(book));
    }
    return list;
  }
}

public class Main{
  public static void main(String[] args){
    Library lbadnu = new Library();
  }
}
