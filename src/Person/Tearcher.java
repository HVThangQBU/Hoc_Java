package Person;

public class Tearcher extends Person {
  int salary;

  public Tearcher(String name, int age, String address, int salary) {
    super(name, age, address);
    this.salary = salary;
  }

  public int getSalary() {
    return salary;
  }

  public void setSalary(int slary) {
    this.salary = slary;
  }

  @Override
  public void display() {
    super.display();
    System.out.println("salary: "+ salary);
  }

  @Override
  public String toString() {
    String dis = super.toString();
    return "Tearcher{" +
      "salary=" + salary + dis+
      '}';
  }
}
