package Experiment7;

import java.util.Scanner;

class ArrayStack {
    int[] stack;
    int top;
    int capacity;

    public void createArrayStack() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the capacity of the stack: ");
        capacity = scanner.nextInt();
        stack = new int[capacity];
        top = -1;
        System.out.println("Array-based stack created successfully.");
    }

    public void push_array() {
        if (isFull_array()) {
            System.out.println("Stack Overflow.");
            return;
        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the element to push: ");
        int element = scanner.nextInt();
        stack[++top] = element;
        System.out.println("Element pushed successfully.");
    }

    public void pop_array() {
        if (isEmpty_array()) {
            System.out.println("Stack Underflow.");
            return;
        }
        System.out.println("Popped element: " + stack[top--]);
    }

    public void peek_array() {
        if (isEmpty_array()) {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.println("Top element: " + stack[top]);
    }

    public boolean isEmpty_array() {
        return top == -1;
    }

    public boolean isFull_array() {
        return top == capacity - 1;
    }
}