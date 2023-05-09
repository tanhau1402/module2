package excercises;

import java.util.Scanner;

public class TransferNumber {
    final static String[] arrayNumber = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven",
            "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    final static String[] arrayRound = {"", "", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninety"};

    public static void main(String[] args) {
        int number = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number : ");
        number = scanner.nextInt();
        if (number < 20 && number > 0) {
            System.out.println(arrayNumber[number]);
        } else if (number < 100 && number > 0) {
            if (number % 10 == 0) {
                System.out.println(arrayRound[number / 10]);
            } else {
                System.out.println(arrayRound[number / 10] + " " + arrayNumber[number % 10]);
            }
        } else if (number < 1000 && number > 0) {
            if (number % 100 == 0) {
                System.out.println(arrayNumber[number / 100] + "hundred");
            } else if (number % 100 < 20) {
                System.out.println(arrayNumber[number / 100] + " hundred and " + arrayNumber[number % 100]);
            } else {
                System.out.println(arrayNumber[number / 100] + " hundred and " + arrayRound[(number % 100) / 10] + " " + arrayNumber[number % 10]);
            }

        }
    }
}
