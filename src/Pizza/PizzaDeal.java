package Pizza;

import iShape.IShape;

public class PizzaDeal {



  public double deal(Pizza pz){
        return pz.getPrice() / pz.getShape().getArea();
  }
  public boolean betterDeal(Pizza pz1, Pizza pz2){
    return deal(pz1) < deal(pz2);
  }

}
