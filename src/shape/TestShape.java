package shape;

public class TestShape {
    public static void main(String[] args){
        Shape s1 = new Rectangle("cn1",24,40);
        Shape s2 = new Circle("htr0n1",15);
        Shape s3 = new Rectangle("cn2",23,30);
        Shape s4 = new Circle("htr0n2",17);
        Shape[] shapeList = {s1, s2, s3, s4};
//        System.out.println(s1+", dien tich:"+s1.caculareArea());
//        System.out.println(s2+", dien tich:"+s2.caculareArea());
        for(Shape s: shapeList) {
            System.out.println(s + "dien tich " + s.caculareArea());
        }
    }
}
