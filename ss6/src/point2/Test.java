package point2;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Point point = new Point(3, 4);
        MovablePoint movablePoint = new MovablePoint(5, 6);
        point.setX(1);
        System.out.println(Arrays.toString(point.getXY()));
        System.out.println(movablePoint.move());
    }
}
