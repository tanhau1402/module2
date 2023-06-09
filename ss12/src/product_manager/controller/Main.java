package product_manager.controller;

import product_manager.services.ProductServices;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        displayMenu();
    }

    public static void displayMenu() {
        String select;
        do {
            System.out.println("Menu : ");
            System.out.println("1. Add product : ");
            System.out.println("2. Edit product : ");
            System.out.println("3. Remove product");
            System.out.println("4. Search product");
            System.out.println("5. Display list product");
            System.out.println("enter your select : ");
            select = scanner.nextLine();
            switch (select) {
                case "1":
                    ProductServices.addProduct();
                    break;
                case "2":
                    ProductServices.editProduct();
                    break;
                case "3":
                    ProductServices.removeProduct();
                    break;
                case "4":
                    ProductServices.searchProduct();
                    break;
                case "5":
                    ProductServices.displayProduct();
                    break;
            }
        } while (true);
    }
}
