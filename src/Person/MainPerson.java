package Person;

public class MainPerson {
  public static void  main(String [] args){
    Student student = new Student("thang", 21, "duc ninh dong", 4.5);
    Tearcher tearcher = new Tearcher("tearcher", 35, "bac ly",50000000);
    tearcher.display();
    student.display();
    System.out.println(tearcher);
  }
}
