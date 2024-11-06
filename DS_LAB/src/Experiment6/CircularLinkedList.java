package Experiment6;
import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class CircularLL {
    Node head;

    public void createCircularLinkedList() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of nodes: ");
        int n = scanner.nextInt();

        System.out.print("Enter the data for the first node: ");
        int data = scanner.nextInt();
        head = new Node(data);
        Node currentNode = head;

        for (int i = 1; i < n; i++) {
            System.out.print("Enter the data for the next node: ");
            data = scanner.nextInt();
            Node newNode = new Node(data);
            currentNode.next = newNode;
            currentNode = newNode;
        }

        currentNode.next = head;
        System.out.println("Circular linked list created successfully.");
    }

    public void insertAtBeginning() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the data for the new node: ");
        int data = scanner.nextInt();
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            head.next = head;
        } else {
            Node currentNode = head;
            while (currentNode.next != head) {
                currentNode = currentNode.next;
            }
            newNode.next = head;
            currentNode.next = newNode;
            head = newNode;
        }

        System.out.println("New node inserted at the beginning successfully.");
    }

    public void insertAtEnd() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the data for the new node: ");
        int data = scanner.nextInt();
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            head.next = head;
        } else {
            Node currentNode = head;
            while (currentNode.next != head) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
            newNode.next = head;
        }

        System.out.println("New node inserted at the end successfully.");
    }

    public void insertAtSpecificLocation() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the data for the new node: ");
        int data = scanner.nextInt();
        System.out.print("Enter the location (1-based index) to insert the new node: ");
        int location = scanner.nextInt();

        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            head.next = head;
        } else if (location == 1) {
            Node currentNode = head;
            while (currentNode.next != head) {
                currentNode = currentNode.next;
            }
            newNode.next = head;
            currentNode.next = newNode;
            head = newNode;
        } else {
            Node currentNode = head;
            for (int i = 1; i < location - 1 && currentNode.next != head; i++) {
                currentNode = currentNode.next;
            }
            newNode.next = currentNode.next;
            currentNode.next = newNode;
        }

        System.out.println("New node inserted at the specified location successfully.");
    }

    public void deleteAtBeginning() {
        if (head == null) {
            System.out.println("Circular linked list is empty. Deletion failed.");
            return;
        }

        if (head.next == head) {
            head = null;
            System.out.println("Node deleted from the beginning successfully.");
            return;
        }

        Node currentNode = head;
        while (currentNode.next != head) {
            currentNode = currentNode.next;
        }
        currentNode.next = head.next;
        head = head.next;
        System.out.println("Node deleted from the beginning successfully.");
    }

    public void deleteAtEnd() {
        if (head == null) {
            System.out.println("Circular linked list is empty. Deletion failed.");
            return;
        }

        if (head.next == head) {
            head = null;
            System.out.println("Node deleted from the end successfully.");
            return;
        }

        Node currentNode = head;
        while (currentNode.next.next != head) {
            currentNode = currentNode.next;
        }
        currentNode.next = head;
        System.out.println("Node deleted from the end successfully.");
    }

    public void deleteAtSpecificLocation() {
        if (head == null) {
            System.out.println("Circular linked list is empty. Deletion failed.");
            return;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the location (1-based index) of the node to delete: ");
        int location = scanner.nextInt();

        if (location == 1) {
            deleteAtBeginning();
            return;
        }

        Node currentNode = head;
        for (int i = 1; i < location - 1 && currentNode.next != head; i++) {
            currentNode = currentNode.next;
        }
        if (currentNode.next == head) {
            System.out.println("Invalid location. Deletion failed.");
            return;
        }
        Node nodeToDelete = currentNode.next;
        currentNode.next = nodeToDelete.next;
        System.out.println("Node deleted from the specified location successfully.");
    }

    public void printLinkedList() {
        if (head == null) {
            System.out.println("Circular linked list is empty.");
            return;
        }

        Node currentNode = head;
        System.out.print("Circular linked list: ");
        do {
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.next;
        } while (currentNode != head);
        System.out.println("HEAD");
    }
}

public class CircularLinkedList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CircularLL linkedList = new CircularLL();
        int choice;

        do {
            displayMenu();
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    linkedList.createCircularLinkedList();
                    break;
                case 2:
                    linkedList.insertAtBeginning();
                    break;
                case 3:
                    linkedList.insertAtEnd();
                    break;
                case 4:
                    linkedList.insertAtSpecificLocation();
                    break;
                case 5:
                    linkedList.deleteAtBeginning();
                    break;
                case 6:
                    linkedList.deleteAtEnd();
                    break;
                case 7:
                    linkedList.deleteAtSpecificLocation();
                    break;
                case 8:
                    linkedList.printLinkedList();
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 9);

        System.out.println("Goodbye!");
    }

    public static void displayMenu() {
        System.out.println("Menu:");
        System.out.println("1. Create a circular linked list");
        System.out.println("2. Insert a node at the beginning");
        System.out.println("3. Insert a node at the end");
        System.out.println("4. Insert a node at a specific location");
        System.out.println("5. Delete a node from the beginning");
        System.out.println("6. Delete a node from the end");
        System.out.println("7. Delete a node from a specific location");
        System.out.println("8. Print the circular linked list");
        System.out.println("9. Exit");
        System.out.print("Enter your choice (1-9): ");
    }
}