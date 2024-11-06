package Experiment9;

import java.util.Stack;
import java.util.Scanner;

public class ParenthesisBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an expression: ");
        String input = scanner.nextLine();
        System.out.println(isBalanced(input));
    }

    public static String isBalanced(String expression) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);

            if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                if (stack.isEmpty()) {
                    return "Parenthesis Not Balanced";
                }
                stack.pop();
            }
        }

        return stack.isEmpty() ? "Parenthesis Balanced" : "Parenthesis Not Balanced";
    }
}
