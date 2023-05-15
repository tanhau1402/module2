package excercises;

import java.util.Scanner;

public class CountChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = "abcdaaa";
        String key;
        int count = 0;
        System.out.println("nhap ki tu : ");
        key = scanner.nextLine();
        for (int i = 0; i < str.length(); i++) {
            if (key.matches(String.valueOf(str.charAt(i)))) {
                count++;
            }
        }
        if (count > 0) {
            System.out.println("so lan xuat hien cua ky tu " + key + " trong chuoi la : " + count);
        } else {
            System.out.println("k tim thay");
        }
    }
}
