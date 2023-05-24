package circle;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Cylinder cylinder = new Cylinder(5);
        circle.setRadius(4);
        circle.setColor("blue");
        cylinder.setColor("yellow");
        cylinder.setHeight(7);
        cylinder.setRadius(3);
        System.out.println(cylinder.getVolume());
        System.out.println(circle.getArea());
        System.out.println(circle);
    }
}
