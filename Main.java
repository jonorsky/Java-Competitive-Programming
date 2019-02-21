import java.util.Scanner;

class Person{
  private String name;
  private static final String SCHOOL = "Ateneo de Naga University";
  private String course;
  private int id;

  public Person(){} // Runtime Polymorph

  public Person(String name, String couse, int id){
    this.name = name;
    this.course = couse;
    this.id = id;
  }

  public void setName(String name){
    this.name = name;
  }

  public void setCourse(String course){
    this.course = course;
  }

  public void setId(int id){
    this.id = id;
  }

  @Override
  public String toString(){
    StringBuilder str = new StringBuilder();

    str.append("Name: " + name + "\n");
    str.append("ID Number: " + id + "\n");
    str.append("School: " + SCHOOL + "\n");
    str.append("Course: " + course);

    return str.toString();
  }
}

public class Main{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    Person obj = new Person();
    obj.setName("Edabun");
    obj.setId(201523231);
    obj.setCourse("Bachelor of Science in Information Technology");


    Person arr[] = new Person[2];
    System.out.println("Input 2 Students with their Name,ID, and Course. \n");

    for(int i=0; i<2; i++){
      System.out.println("Student # " + (i+1));
      arr[i] = new Person();
      System.out.print("Input Name: ");
      arr[i].setName(in.nextLine());
      System.out.print("Input ID: ");
      arr[i].setId(in.nextInt());
      in.nextLine();
      System.out.print("Input Course: ");
      arr[i].setCourse(in.next());
      System.out.println();
    }

    for(Person i:arr){
      System.out.println(i + "\n");
    }

    // System.out.println(obj);
  }
}
