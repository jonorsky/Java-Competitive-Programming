import java.util.Date;

final class Header{
  private final String title;
  private final int version;
  private final Date date;

  public Header(String title, int version, Date date){
    this.title = title;
    this.version = version;
    this.date = new Date(date.getTime());
  }

  public Date getDate(){
    return new Date(date.getTime());
  }

  public String getTitle(){
    return title;
  }

  public int getVersion(){
    return version;
  }

  public String toString(){
  return  "Title: " + this.title + "\n" +
          "Version: " + this.version + "\n" +
          "Date: " + this.date + "\n";
  }
}

public class Main{
  public static void main(String[] args){
    Header hd = new Header("SP Project",1,new java.util.Date());
    System.out.println(hd);
    Header hd1 = new Header("Graduation Day",2,new java.util.Date());
    System.out.println(hd1);

  }
}
