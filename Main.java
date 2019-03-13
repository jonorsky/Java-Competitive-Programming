import java.util.Date;

final class Header{
  private final String title;
  private final int version;
  private final Date date;

  public Header(String tile, int version, Date date){
    this.title = tile;
    this.version = version;
    this.date = new Date(date.getTime());
  }

}

public class Main{
  public static void main(String[] args){
    System.out.println("Immutable Objects");
  }
}
