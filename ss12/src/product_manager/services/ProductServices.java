package product_manager.services;

import product_manager.model.Product;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductServices {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Product> productArrayList = new ArrayList<>();

    public static void addProduct() {
        System.out.println("enter id :");
        String id = scanner.nextLine();
        System.out.println("enter name : ");
        String name = scanner.nextLine();
        System.out.println("enter price : ");
        String price = scanner.nextLine();
        Product product = new Product(id, name, price);
        productArrayList.add(product);
    }

    public static void editProduct() {
        System.out.println("enter id of product : ");
        String id = scanner.nextLine();
        for (Product product : productArrayList) {
            if ((product.getId().matches(id))) {
                System.out.println("enter new id : ");
                String newId = scanner.nextLine();
                product.setId(newId);
                System.out.println("enter new name :");
                String newName = scanner.nextLine();
                product.setName(newName);
                System.out.println("enter new price : ");
                String newPrice = scanner.nextLine();
                product.setPrice(newPrice);
                System.out.println("Product with id " + id + " has been updated !");
            } else {
                System.out.println("Can't find this id  : " + id);
            }
        }
    }

    public static void removeProduct() {
        System.out.println("enter id of product : ");
        String id = scanner.nextLine();
        for (Product product : productArrayList) {
            if ((product.getId()).equals(id)) {
                productArrayList.remove(product);
                System.out.println("Product with id : " + id + " has been deleted !");
                break;
            } else {
                System.out.println("Can't find this id  : " + id);
                break;
            }
        }
    }

    public static void displayProduct() {
        for (Product product : productArrayList) {
            System.out.println(product + "\n");
        }
    }

    public static void searchProduct() {
        System.out.println("enter id : ");
        String id = scanner.nextLine();
        for (Product product : productArrayList) {
            if ((product.getId()).equals(id)) {
                System.out.println(product);
                break;
            } else {
                System.out.println("Can't find this id  : " + id);
                break;
            }
        }
    }
}
