package Experiment2;
import java.util.Scanner;

public class arrays_print {
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
                    printEvenElements(array);
                    break;
                case 3:
                    array = createArray(scanner);
                    printOddElements(array);
                    break;
                case 4:
                    array = createArray(scanner);
                    printAllElements(array);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 5);

        System.out.println("Goodbye!");
    }

    public static void displayMenu() {
        System.out.println("Menu:");
        System.out.println("1. Create an array");
        System.out.println("2. Print elements at even indices");
        System.out.println("3. Print odd elements");
        System.out.println("4. Print all elements");
        System.out.println("5. Exit");
        System.out.print("Enter your choice (1-5): ");
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

    public static void printEvenElements(int[] array) {
        System.out.println("Elements at even indices:");
        for (int i = 0; i < array.length; i += 2) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void printOddElements(int[] array) {
        System.out.println("Odd elements:");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
    }

    public static void printAllElements(int[] array) {
        System.out.println("All elements:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}