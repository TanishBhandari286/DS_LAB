package Experiment7;

import java.util.Scanner;

public class StackMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayStack arrayStack = new ArrayStack();
        LinkedListStack linkedListStack = new LinkedListStack();
        int choice;
        String stackType = "";

        do {
            displayMenu();
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the stack type (array/linkedlist): ");
                    stackType = scanner.next();
                    if (stackType.equalsIgnoreCase("array")) {
                        arrayStack.createArrayStack();
                    } else if (stackType.equalsIgnoreCase("linkedlist")) {
                        linkedListStack.createLinkedListStack();
                    } else {
                        System.out.println("Invalid stack type. Please try again.");
                    }
                    break;
                case 2:
                    if (stackType.equalsIgnoreCase("array")) {
                        arrayStack.pop_array();
                    } else if (stackType.equalsIgnoreCase("linkedlist")) {
                        linkedListStack.pop_linkedList();
                    } else {
                        System.out.println("Stack not created yet. Please create a stack first.");
                    }
                    break;
                case 3:
                    if (stackType.equalsIgnoreCase("array")) {
                        arrayStack.push_array();
                    } else if (stackType.equalsIgnoreCase("linkedlist")) {
                        linkedListStack.push_linkedList();
                    } else {
                        System.out.println("Stack not created yet. Please create a stack first.");
                    }
                    break;
                case 4:
                    if (stackType.equalsIgnoreCase("array")) {
                        arrayStack.peek_array();
                    } else if (stackType.equalsIgnoreCase("linkedlist")) {
                        linkedListStack.peek_linkedList();
                    } else {
                        System.out.println("Stack not created yet. Please create a stack first.");
                    }
                    break;
                case 5:
                    if (stackType.equalsIgnoreCase("array")) {
                        System.out.println("Stack is " + (arrayStack.isEmpty_array() ? "" : "not ") + "empty.");
                    } else if (stackType.equalsIgnoreCase("linkedlist")) {
                        System.out.println("Stack is " + (linkedListStack.isEmpty_linkedList() ? "" : "not ") + "empty.");
                    } else {
                        System.out.println("Stack not created yet. Please create a stack first.");
                    }
                    break;
                case 6:
                    if (stackType.equalsIgnoreCase("array")) {
                        System.out.println("Stack is " + (arrayStack.isFull_array() ? "" : "not ") + "full.");
                    } else {
                        System.out.println("Not Applicable for Linked List.");
                    }
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 7);

        System.out.println("Goodbye!");
    }

    public static void displayMenu() {
        System.out.println("Menu:");
        System.out.println("1. Create a stack");
        System.out.println("2. Pop");
        System.out.println("3. Push");
        System.out.println("4. Peek");
        System.out.println("5. Is Empty");
        System.out.println("6. Is Full");
        System.out.println("7. Exit");
        System.out.print("Enter your choice (1-7): ");
    }
}