package excercises;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class PrintShape {
    public static void main(String[] args) {
        displayMainMenu();
    }

    public static void displayMainMenu() {
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Menu : ");
            System.out.println("1. Print the rectangle ");
            System.out.println("2. Print the square triangle");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit ");
            System.out.println("Enter your select : ");
            String select = sc.nextLine();
            switch (select) {
                case "1":
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < 10; j++) {
                            System.out.print("*");
                        }
                        System.out.println("\n");
                    }
                    break;
                case "2":
                    for (int i = 0; i < 6; i++) {
                        for (int j = 0; j < i; j++) {
                            System.out.print("*");
                        }
                        System.out.println("\n");
                    }
                    break;
                case "3":
                    for (int i = 0; i < 6; i++) {
                        for (int j = 0; j < i + 1; j++) {
                            System.out.print("*");
                        }
                        System.out.println("\n");
                    }
                    for (int i = 5; i > 0; i--) {
                        for (int j = 0; j < i; ++j) {
                            System.out.print("*");
                        }
                        System.out.println("\n");
                    }

                    break;
                case "4":
                    System.exit(4);
                    break;
            }
        } while (true);
    }
}
