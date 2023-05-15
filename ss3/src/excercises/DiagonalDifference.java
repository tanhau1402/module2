package excercises;

import com.sun.xml.internal.ws.addressing.WsaActionUtil;

import java.util.List;
import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int step;
        int sum = 0;
        System.out.println("nhap bac cua ma tran vuong : ");
        step = Integer.parseInt(scanner.nextLine());
        int[][] arr = new int[step][step];
        for (int i = 0; i < step; i++) {
            for (int j = 0; j < step; j++) {
                System.out.println("arr[" + i + "][" + j + "]");
                arr[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        System.out.println("arr : ");
        for (int i = 0; i < step; i++) {
            for (int j = 0; j < step; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(" ");
        }
        for (int i = 0; i < step; i++) {
            for (int j = 0; j < step; j++) {
                if (i == j) {
                    sum += arr[i][j];
                }
            }
        }
        System.out.println("tong cac so o duong cheo : " + sum);
    }

}
