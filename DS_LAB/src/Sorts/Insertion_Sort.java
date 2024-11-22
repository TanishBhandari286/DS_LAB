package Sorts;
import java.util.Scanner;
public class Insertion_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[7];

        System.out.println("Enter 7 numbers:");
        for(int i = 0; i < 7; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i = 1; i < 7; i++) {
            int replace = arr[i];
            int j = i - 1;

            while(j >= 0 && arr[j] > replace) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = replace;
        }


        System.out.println("Solution");
        for(int i = 0; i < 7; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
