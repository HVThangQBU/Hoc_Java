package IEmployee;

public class TestIEmployee {
  public static void main(String[] args){
    IEmployee e1 = new FullTimeEmployee("Thang",16000);
    IEmployee e2 = new PartTimeEmployee("Thang2",15000,5);
    IEmployee e3 = new FullTimeEmployee("Thang3", 17000);
    IEmployee e4 = new PartTimeEmployee("Thang4", 16000,4);
    IEmployee e5 = new FullTimeEmployee("Thang5",17500);
    IEmployee e6 = new PartTimeEmployee("Thang6",15500,7);
    IEmployee[] iEmployee = {e1, e2, e3, e4, e5, e6};
    for (IEmployee iEm: iEmployee){
      System.out.println("Nguoi thu ten: " + iEm.getName());
      System.out.println("Tien luong: " + iEm.calculateSalary());
    }

  }
}
