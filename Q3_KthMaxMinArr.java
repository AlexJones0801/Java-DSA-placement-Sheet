// Q3. Find the 'Kth' max and min element of an array

public class Q3_KthMaxMinArr {
    public static void main(String[] args) {
        int[] arr = { 7, 5, 15, 22, 3, 10, 6 };
        int k = 3; // Example kth element

        // Printing original array using for each loop
        for (int i : arr) {
            System.out.print(i + " ");
        }

        // Sorting array in ascending order to find Kth element
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }


        System.out.println("\n" + k + "th min element of array is: " + arr[k - 1]);
        System.out.println(k + "th max element of array is: " + arr[arr.length - k]);
    }
}
