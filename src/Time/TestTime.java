package Time;

public class TestTime {
  public static void main(String[] args){
    Time time = new Time(23,59,58);
    System.out.println("next second");
    for (int i = 0 ; i < 20; i++){
      time.display();
      try{
        time.nextSecond();
      }catch (Exception ex){
        System.out.println("loi");
      }
    }
    Time time1 = new Time(0,0,2);
    System.out.println("previous second");
    for (int i = 0 ; i < 20; i++){
      time1.display();
      try{
        time1.previousSecond();
      }catch (Exception ex){
        System.out.println("loi");
      }
    }

  }
}
