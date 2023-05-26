package models;

public class Employee extends Person {
    private String employeeCode;
    private String level;
    private String vitri;
    private String salary;

    public Employee() {
    }

    public Employee(String employeeCode,String level, String vitri, String salary) {
        this.employeeCode = employeeCode;
        this.level = level;
        this.vitri = vitri;
        this.salary = salary;
    }

    public Employee(String id, String name, String dateOfBirth, String sex, String phoneNumber, String email, String employeeCode, String level, String vitri, String salary) {
        super(id, name, dateOfBirth, sex, phoneNumber, email);
        this.employeeCode = employeeCode;
        this.level = level;
        this.vitri = vitri;
        this.salary = salary;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getVitri() {
        return vitri;
    }

    public void setVitri(String vitri) {
        this.vitri = vitri;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "level='" + level + '\'' +
                ", vitri='" + vitri + '\'' +
                ", salary='" + salary + '\'' +
                "} " + super.toString();
    }
}
