package bracket_checker;

import java.util.Objects;
import java.util.Stack;

public class bracketChecker {
    public static void main(String[] args) {
        String expression = "{{x + y} * {z / 2}}}";
        System.out.println(bracketCheckerI(expression));
    }

    private static boolean bracketCheckerI(String expression) {
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < expression.length(); i++) {
            String c = String.valueOf(expression.charAt(i));
            if (c.equals("{")) {
                stack.push(c);
            } else if (c.equals("}")) {
                if (stack.isEmpty() || !Objects.equals(stack.pop(), "{")) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
