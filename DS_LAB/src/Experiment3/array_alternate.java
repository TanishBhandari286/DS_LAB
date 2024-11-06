package Experiment3;
import java.util.Scanner;

public class array_alternate {
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
                    int sumOfAllElements = findSumOfAllElements(array);
                    System.out.println("The sum of all elements is: " + sumOfAllElements);
                    break;
                case 3:
                    array = createArray(scanner);
                    int sumOfAlternateElements = findSumOfAlternateElements(array);
                    System.out.println("The sum of alternate elements is: " + sumOfAlternateElements);
                    break;
                case 4:
                    array = createArray(scanner);
                    int secondHighestElement = findSecondHighestElement(array);
                    System.out.println("The second highest element is: " + secondHighestElement);
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
        System.out.println("2. Find the sum of all elements");
        System.out.println("3. Find the sum of alternate elements");
        System.out.println("4. Find the second highest element");
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

    public static int findSumOfAllElements(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static int findSumOfAlternateElements(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i += 2) {
            sum += array[i];
        }
        return sum;
    }

    public static int findSecondHighestElement(int[] array) {
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > highest) {
                secondHighest = highest;
                highest = array[i];
            } else if (array[i] > secondHighest && array[i] != highest) {
                secondHighest = array[i];
            }
        }

        return secondHighest;
    }
}