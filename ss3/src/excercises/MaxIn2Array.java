package excercises;

import java.util.Arrays;
import java.util.Scanner;

public class MaxIn2Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m, n;
        System.out.println("Nhap so dong cua ma tran : ");
        m = Integer.parseInt(scanner.nextLine());
        System.out.println("nhap so cot cua ma tran : ");
        n = Integer.parseInt(scanner.nextLine());
        int[][] array = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("array [" + i + "][" + j + "] =  ");
                array[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
       // System.out.println("array : " + Arrays.toString(array));
        int max = array[0][0];
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        System.out.println("phan tu lon nhat trong mang 2 chieu : " + max);
    }
}
