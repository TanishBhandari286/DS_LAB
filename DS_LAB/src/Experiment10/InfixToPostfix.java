package Experiment10;

import java.util.Scanner;

public class InfixToPostfix {
    public static String convertToPostfix(String expression) {
        StringBuilder postfix = new StringBuilder();
        StringBuilder stack = new StringBuilder();

        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                postfix.append(c);
            } else if (c == '(') {
                stack.append(c);
            } else if (c == ')') {
                while (stack.length() > 0 && stack.charAt(stack.length() - 1) != '(') {
                    postfix.append(stack.charAt(stack.length() - 1));
                    stack.deleteCharAt(stack.length() - 1);
                }
                if (stack.length() > 0 && stack.charAt(stack.length() - 1) == '(') {
                    stack.deleteCharAt(stack.length() - 1);
                }
            } else {
                while (stack.length() > 0 && (getPrecedence(stack.charAt(stack.length() - 1)) >= getPrecedence(c))) {
                    postfix.append(stack.charAt(stack.length() - 1));
                    stack.deleteCharAt(stack.length() - 1);
                }
                stack.append(c);
            }
        }

        while (stack.length() > 0) {
            postfix.append(stack.charAt(stack.length() - 1));
            stack.deleteCharAt(stack.length() - 1);
        }

        return postfix.toString();
    }

    private static int getPrecedence(char op) {
        if (op == '+' || op == '-') {
            return 1;
        } else if (op == '*' || op == '/') {
            return 2;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the infix expression: ");
        String infixExpression = scanner.nextLine();
        String postfixExpression = convertToPostfix(infixExpression);
        System.out.println("Infix expression: " + infixExpression);
        System.out.println("Postfix expression: " + postfixExpression);
    }
}