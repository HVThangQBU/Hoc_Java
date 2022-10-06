package Pizza;
import iShape.Circle;
import iShape.Rectangle;

public class PizzaClient {
  public  void run() {
    Pizza pztron = new Pizza(20, new Circle(3));
    Pizza pzvuong = new Pizza(30,new Rectangle(5,3));
    PizzaDeal pz = new PizzaDeal();
    System.out.println(pztron.getShape().getArea());
    System.out.println(pzvuong.getShape().getArea());
    System.out.println(pztron + "deal: "+ pz.deal(pztron));
    System.out.println(pzvuong+": deal: "+pz.deal(pzvuong));
    System.out.println("bettet deal: "+pz.betterDeal(pztron,pzvuong));
  }
  public static void main(String[] args){
   new PizzaClient().run();
  }
}
