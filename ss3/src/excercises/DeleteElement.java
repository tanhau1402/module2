package excercises;

import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap phan tu can xoa : ");
        int deleteValue = scanner.nextInt();
        int deleteIndex = findIndex(array, deleteValue);
        if (deleteIndex == -1) {
            System.out.println("Khong tim thay gia tri !");
        } else {
            array = deleteElement(array, deleteIndex);
        }
        for (int n : array) {
            System.out.println(n + " ");
        }
    }

    public static int findIndex(int[] array, int element) {
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                index = i;
            }
        }
        return index;
    }

    static int[] deleteElement(int[] array, int index) {
        int[] newArray = new int[array.length - 1];
        if (index >= 0) System.arraycopy(array, 0, newArray, 0, index);
        if (array.length - (index + 1) >= 0)
            System.arraycopy(array, index + 1, newArray, index + 1 - 1, array.length - (index + 1));
        return newArray;
    }
}
