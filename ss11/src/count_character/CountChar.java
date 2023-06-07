package count_character;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter str with space : ");
        String str = scanner.nextLine();
        Map<String, Integer> wordsCountMap = new HashMap<>();
        String[] words = str.split("\\s+");
        // \\s+ khi nhap khoang trang thi count se k tang
        for (String word : words) {
            if (wordsCountMap.containsKey(word)) {
                int count = wordsCountMap.get(word);
                wordsCountMap.put(word, count + 1);
            } else {
                wordsCountMap.put(word, 1);
            }
        }
        System.out.println("So lan xuat hien cua tung tu trong chuoi la :");
        for (String word : wordsCountMap.keySet()) {
            System.out.println(word + " : " + wordsCountMap.get(word));
        }
    }

}
