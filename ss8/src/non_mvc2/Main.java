package non_mvc2;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        displayMenu();
    }

    public static List<Student> studentList;

    public static void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        int choose;
        do {
            System.out.println("========== Menu ==========");
            System.out.println("1. Tạo Học Sinh");
            System.out.println("2. Xem Danh Sách Học Sinh");
            System.out.println("3. Sửa");
            System.out.println("4. Xóa");
            System.out.println("5. Nhấn số bất kỳ khác trên để thoát");

            System.out.println("Mời cưng chọn chức năng: ");
            choose = Integer.parseInt(scanner.nextLine());

            switch (choose) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    displayList();
                    break;
                case 3:
                    changeInfoStudent();
                    break;
                case 4:
                    System.out.println("nhap id can xoa :");
                    String id = String.valueOf(Integer.parseInt(scanner.nextLine()));
                    deleteStudent(id);
                    break;
            }
        } while (choose >= 1 && choose <= 4);
    }

    public static void addStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter id :");
        String id = scanner.nextLine();
        System.out.println("enter name : ");
        String name = scanner.nextLine();
        System.out.println("enter score  :");
        String score = String.valueOf(Double.parseDouble(scanner.nextLine()));
        Student student = new Student(id, name, score);
        studentList.add(student);
    }

    public static void displayList() {
        for (Student student : studentList) {
            System.out.println(student + "\n");
        }
    }

    public static void deleteStudent(String id) {
        for (Student student : studentList) {
            if (student.getId().equals(id)) {
                studentList.remove(student);
                System.out.println("xoa thanh cong");
                break;
            } else {
                System.out.println("khong tim thay hs");
                break;
            }
        }
    }

    public static void changeInfoStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap id hs can sua thong tin : ");
        String id = String.valueOf(Integer.parseInt(scanner.nextLine()));
        for (Student student : studentList) {
            if (student.getId().equals(id)) {
                System.out.println("nhap lai id : ");
                String newId = String.valueOf(Integer.parseInt(scanner.nextLine()));
                System.out.println("nhap lai ten : ");
                String newName = scanner.nextLine();
                System.out.println("nhap lai diem : ");
                String newScore = String.valueOf(Double.parseDouble(scanner.nextLine()));
                Student newStudent = new Student(newId, newName, newScore);
                studentList.add(newStudent);
            }
        }
    }
}
