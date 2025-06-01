package Arrays;
// Q9. Check if array is sorted and rotated

import java.util.Scanner;

public class Q9_ifArrisSortedandRotated {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter Elements of Array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        int count = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            int next = (i + 1) % arr.length;
            if (arr[i] > arr[next]) {
                count++;
            }

        }

        if (count == 1)
            System.out.println("Sorted and Rotated");
        else
            System.out.println("Not Sorted and Rotated");
    }
}
