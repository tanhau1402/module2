package excercises;

import java.util.Arrays;
import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("do dai cua mang : ");
        int size =Integer.parseInt(scanner.nextLine());
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("nhap phan tu thu " + (i + 1) + " : " );
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("mang vua nhap : " + Arrays.toString(array));
        System.out.println("nhap so can chen : ");
        int x = Integer.parseInt(scanner.nextLine());
        System.out.println("nhap vi tri index can chen : ");
        int index = Integer.parseInt(scanner.nextLine());
        if (index <= 1 && index >= array.length - 1) {
            System.out.println("khong the chen phan tu vao mang !");
        }else {
            array[index] = x;
        }
        System.out.println("mang sau khi chen : " + Arrays.toString(array));
    }
}

