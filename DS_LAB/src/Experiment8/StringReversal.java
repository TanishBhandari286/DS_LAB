package Experiment8;

import java.util.Stack;
import java.util.Scanner;

public class StringReversal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        String reversedString = reverseString(input);
        System.out.println("Reversed String: " + reversedString);
    }

    public static String reverseString(String input) {
        Stack<Character> stack = new Stack<>();

        for (char ch : input.toCharArray()) {
            stack.push(ch);
        }

        String result = "";
        while (!stack.isEmpty()) {
            result += stack.pop();
        }

        return result;
    }
}
