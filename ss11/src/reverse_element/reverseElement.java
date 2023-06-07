package reverse_element;

import java.util.Arrays;
import java.util.Stack;

public class reverseElement {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        Stack<Integer> stack = new Stack<Integer>();
        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
        }
        int[] reverseArr = new int[arr.length];
        for (int i = 0; i < reverseArr.length; i++) {
            reverseArr[i] = stack.pop();
        }
        System.out.println("Reverse Arr : " + Arrays.toString(reverseArr));
    }
}
