package excercises;

import java.util.Scanner;

public class ChangeMn {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so tien usd : ");
        usd = sc.nextDouble();
        double quydoi = usd * 23000;
        System.out.println("gia tri quy doi : " + quydoi);
    }
}
