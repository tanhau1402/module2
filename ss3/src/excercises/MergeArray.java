package excercises;

import java.util.Arrays;
import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr1 = new int[3];
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("nhap cac phan tu thu " + (i + 1) + " cua mang 1 : ");
            arr1[i] = Integer.parseInt(sc.nextLine());
        }
        int[] arr2 = new int[4];
        for (int i = 0; i < arr2.length; i++) {
            System.out.println("nhap phan tu thu " + (i +1 ) + " cua mang 2 : ");
            arr2[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.println("Mang 1 : " + Arrays.toString(arr1));
        System.out.println("Mang 2 : " + Arrays.toString(arr2));
        int newLength = arr1.length + arr2.length;
        int [] arr3 = new int[newLength];
        int index = 0;
        for (int element : arr1) {
            arr3[index] = element;
            index++;
        }
        for (int element :arr2) {
            arr3[index] = element;
            index++;
        }
        System.out.println("Sau khi gop 2 mang : " + Arrays.toString(arr3));
    }

}
