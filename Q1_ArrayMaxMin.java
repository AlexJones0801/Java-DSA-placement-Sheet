// Q1. Find the maximum and minimum element in an array

public class Q1_ArrayMaxMin {
    public static void main(String[] args) {
        int[] arr = { 3, 4, 2, 55, 12, 6 };
        int min = arr[0], max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("Max Element: " + max + "\nMin Element: " + min);
    }

}