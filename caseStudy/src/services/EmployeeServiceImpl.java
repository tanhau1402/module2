package services;

import models.Employee;

import java.util.ArrayList;

public class EmployeeServiceImpl implements EmployeeService{
    private static  ArrayList<Employee> employees = new ArrayList<>();
    static {
        employees.add(new Employee("123","2","s","300000"));
        employees.add(new Employee("123","2","s","300000"));
    }
    @Override
    public void displayList() {
        for (Employee employee: employees) {
            System.out.println(employee + "\n");
        }
    }
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }
    public void editInfoEmployee(){

    }

}
