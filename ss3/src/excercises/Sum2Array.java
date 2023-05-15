package excercises;

import java.util.Scanner;

public class Sum2Array {
    public static void main(String[] args) {
        main();
    }

    public static void main() {
        do {
            Scanner scanner = new Scanner(System.in);
            int m, n;
            int col;
            int sum = 0;
            System.out.println("nhap so dong : ");
            m = Integer.parseInt(scanner.nextLine());
            System.out.println("nhap so cot : ");
            n = Integer.parseInt(scanner.nextLine());
            int[][] array = new int[m][n];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.println("array [" + i + "][" + j + "]");
                    array[i][j] = Integer.parseInt(scanner.nextLine());
                }
            }
            System.out.println("ma tran : ");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(array[i][j] + " ");
                }
                System.out.println(" ");
            }
            System.out.println("nhap so cot muon tinh tong : ");
            col = Integer.parseInt(scanner.nextLine());
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (j == col) {
                        sum += array[i][j];
                    }
                }
            }
            System.out.println("sum col = " + sum);
        } while (true);
    }
}
