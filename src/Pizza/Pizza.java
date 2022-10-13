package Pizza;
import iShape.IShape;
public class Pizza implements Comparable<Pizza>{
  double price;
  IShape shape;


  public Pizza(double price, IShape shape) {
    this.price = price;
    this.shape = shape;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public IShape getShape() {
    return shape;
  }

  public void setShape(IShape shape) {
    this.shape = shape;
  }

  @Override
  public String toString() {
    return "Pizza{" +
      "price=" + price +
      ", shape=" + shape +
      '}';
  }

  @Override
  public int compareTo(Pizza o) {
    PizzaDeal deal = new PizzaDeal();
    return deal.betterDeal(this,o) ? 1: -1;
  }
}
