package Experiment1;

import java.util.Scanner;

public class arrays_smallest_largest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array;
        int arraySize;
        int choice;

        do {
            displayMenu();
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    array = createArray(scanner);
                    break;
                case 2:
                    array = createArray(scanner);
                    int difference = findDifference(array);
                    System.out.println("The difference between the largest and smallest values is: " + difference);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 3);

        System.out.println("Goodbye!");
    }

    public static void displayMenu() {
        System.out.println("Menu:");
        System.out.println("1. Create an array");
        System.out.println("2. Find the difference between the largest and smallest values in the array");
        System.out.println("3. Exit");
        System.out.print("Enter your choice (1-3): ");
    }

    public static int[] createArray(Scanner scanner) {
        System.out.print("Enter the size of the array: ");
        int arraySize = scanner.nextInt();
        int[] array = new int[arraySize];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < arraySize; i++) {
            array[i] = scanner.nextInt();
        }

        return array;
    }

    public static int findDifference(int[] array) {
        int largest = array[0];
        int smallest = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > largest) {
                largest = array[i];
            }
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }

        return largest - smallest;
    }
}