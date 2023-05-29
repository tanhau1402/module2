package non_mvc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NonMvc {

    // Bước 1: Tạo ra mảng
     public static List<Student> studentList = new ArrayList<>();
    static int size = 0;

//    static {
//        students[0] = new Student(1, "Nguyễn Văn A", 9.6);
//        students[1] = new Student(2, "Nguyễn Văn B", 5.6);
//        students[2] = new Student(3, "Nguyễn Văn C", 6.7);
//        size = 3;
//    }

    public static void main(String[] args) {
        //CRUD student
        /*
        C: Create
        R: Read
        U: Update
        D: Delete
         */
        // Có menu hiển thị 4 chức năng CRUD và thao tác ở trên đó


        // Bước 2: Thêm một số student vào mảng

        // Bước 3: Tạo menu

        // BƯớc 4: Cấu hình cho từng chức năng

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
                    break;
                case 2:

                    break;
                case 3:
                    System.out.println("Bạn đang chọn chức năng Sửa");
                    break;
                case 4:
                    System.out.println("Bạn đang chọn chức năng Xóa");
            }
        } while (choose >= 1 && choose <= 4);
    }
    public static void addStudent(Student student) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap id cua hs : ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("nhap ten hs : ");
        String name = scanner.nextLine();
        System.out.println("nhap diem cua hs");
        double score = Double.parseDouble(scanner.nextLine());
        Student student1 = new Student(id,name,score);
    }
    public static void displayList(Student[] students) {
        for (Student student : students) {
            System.out.println(student + "\n");
        }
    }
    public static void deleteStudent(int id) {
        for (Student student: studentList) {

        }
    }
}
