package palindrome;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class IsPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao chuoi : ");
        String str = scanner.nextLine();
        Queue<Character> characterQueue = new LinkedList<Character>();
        for (int i = 0; i < str.length(); i++) {
            characterQueue.add(str.charAt(i));
        }
        StringBuilder sb = new StringBuilder();
        while (!(characterQueue.isEmpty())){
            sb.append(characterQueue.remove());
        }
        String reverseStr = sb.toString();
        if (str.equals(reverseStr)) {
            System.out.println(str + " la chuoi Palindrome");
        }else {
            System.out.println(str + " khong phai la chuoi Palindrome");
        }
    }
}
