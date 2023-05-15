package excercises;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class FindMinValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap do dai cua mang : ");
        int size = Integer.parseInt(scanner.nextLine());
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("nhap voa phan tu thu " + (i + 1) + "cua mang : ");
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("mang so : " + Arrays.toString(array));
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("gia tri nho nhat trong mang la : " + min);
    }
}
