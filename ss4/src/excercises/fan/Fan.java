package excercises.fan;

import javax.naming.ldap.PagedResultsControl;

public class Fan {
    String SLOW;
    String MEDIUM;
    String FAST;
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public Fan() {
        speed = 1;
        on = false;
        radius = 5;
        color = "blue";
    }

    public String getSLOW() {
        return SLOW;
    }

    public boolean isFanOn() {
        return on;
    }

    public void setSLOW(String SLOW) {
        this.SLOW = SLOW;
    }

    public String getMEDIUM() {
        return MEDIUM;
    }

    public void setMEDIUM(String MEDIUM) {
        this.MEDIUM = MEDIUM;
    }

    public String getFAST() {
        return FAST;
    }

    public void setFAST(String FAST) {
        this.FAST = FAST;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        if (this.isFanOn()) {
            return String.format("%s,%s,%s,%s", speed, color, radius, "fan is on");
        } else {
            return String.format("%s,%s,%s", color, radius, "fan is off");
        }
    }
}
