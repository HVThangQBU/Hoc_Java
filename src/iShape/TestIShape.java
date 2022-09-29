package iShape;

public class TestIShape {
  public static void main(String[] args){
    IShape s1 = new Circle(12);
    IShape s2 = new Rectangle(3.0, 4.5);
    IShape s3 = new Circle(14);
    IShape s4 = new Rectangle(4.0, 50);
    IShape s5 = new Circle(4);
    IShape[] shapes = { s1, s2, s3, s4, s5};
    int i = 1;
    for (IShape hinhDang:shapes){
      System.out.println("dien tich hinh thu" + i + "la: " + hinhDang.getArea());
    }
  }
}
