package modifier;

public class Circle {
    private double radius;
    private String color;


    public Circle() {
    }

    protected Circle(double radius) {
        this.radius = radius;
    }

    private double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}
