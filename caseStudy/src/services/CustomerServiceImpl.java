package services;

import models.Customer;

import java.util.LinkedList;

public class CustomerServiceImpl implements CustomerService {
    private static LinkedList<Customer> customersList = new LinkedList<>();

    static {
        customersList.add(new Customer("123", "1", "qn"));
        customersList.add(new Customer("143", "3", "qnn"));
    }


    @Override
    public void displayList() {
        for (Customer cus : customersList) {
            System.out.println(cus + "\n");
        }
    }


    public void editCustomerInfo(String input) {
        for (Customer customer1 :customersList) {
            if (customer1.getCustomerCode().equals(input)){

            }
        }
    }


    public void addNewCustomer(Customer customer) {
        customersList.add(customer);
    }

}
