package Sorts;
import java.util.Scanner;

public class Selection_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[7];

        System.out.println("Enter 7 numbers:");
        for(int i = 0; i < 7; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < 6; i++) {
            int minimum = i;

            for(int j = i + 1; j < 7; j++) {
                if(arr[j] < arr[minimum]) {
                    minimum = j;
                }
            }

            int temp = arr[minimum];
            arr[minimum] = arr[i];
            arr[i] = temp;
        }

        System.out.println("solution");
        for(int i = 0; i < 7; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}