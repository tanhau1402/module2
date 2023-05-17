package excercises;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminant() {
        return (b * b) - (4 * a * c);
    }

    public double getRoot1() {
        return (-b + Math.pow(getDiscriminant(), 0.5) / 2 * a);
    }

    public double getRoot2() {
        return (-b - Math.pow(getDiscriminant(), 0.5) / 2 * a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a : ");
        double a = Double.parseDouble(sc.nextLine());
        System.out.println("enter b : ");
        double b = Double.parseDouble(sc.nextLine());
        System.out.println("enter c : ");
        double c = Double.parseDouble(sc.nextLine());
        QuadraticEquation result = new QuadraticEquation(a, b, c);
        if (result.getDiscriminant() > 0) {
            System.out.println("root 1 : " + result.getRoot1());
            System.out.println("root 2 : " + result.getRoot2());
        } else if (result.getDiscriminant() == 0) {
            System.out.println("root 1 = root 2 = " + result.getRoot1());
        } else {
            System.out.println("“The equation has no roots”");
        }
    }
}
