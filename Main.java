class Person{
  private String name;
  private static final String SCHOOL = "Ateneo de Naga University";
  private String course;
  private int id;

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
    StringBuilder str = new StringBuilder("");

    str.append("Name: " + name + "\n");
    str.append("ID Number: " + id + "\n");
    str.append("School: " + SCHOOL + "\n");
    str.append("Course: " + course);

    return str.toString();
  }
}

public class Main{
  public static void main(String[] args){

    Person obj = new Person();
    obj.setName("Edabun");
    obj.setId(201523231);
    obj.setCourse("Bachelor of Science in Information Technology");

    System.out.println(obj);
  }
}
