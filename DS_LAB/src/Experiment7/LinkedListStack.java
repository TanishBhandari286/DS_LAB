package Experiment7;

import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedListStack {
    Node top;

    public void createLinkedListStack() {
        top = null;
        System.out.println("Linked List-based stack created successfully.");
    }

    public void push_linkedList() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the element to push: ");
        int element = scanner.nextInt();
        Node newNode = new Node(element);
        newNode.next = top;
        top = newNode;
        System.out.println("Element pushed successfully.");
    }

    public void pop_linkedList() {
        if (isEmpty_linkedList()) {
            System.out.println("Stack Underflow.");
            return;
        }
        System.out.println("Popped element: " + top.data);
        top = top.next;
    }

    public void peek_linkedList() {
        if (isEmpty_linkedList()) {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.println("Top element: " + top.data);
    }

    public boolean isEmpty_linkedList() {
        return top == null;
    }
}