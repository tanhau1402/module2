package decimal_to_binary;
import java.util.Scanner;
import java.util.Stack;

public class DecimalTransfer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so nhi phan can chuyen doi : ");
        int decimal = Integer.parseInt(scanner.nextLine());
        Stack<Integer> binary = new Stack<>();
        while (decimal != 0) {
            int bit = decimal % 2;
            binary.push(bit);
            decimal = decimal / 2;
        }
        System.out.println("Sau khi chuyen doi : ");
        while (!(binary.isEmpty())) {
            System.out.println(binary.pop());
        }
    }
}
