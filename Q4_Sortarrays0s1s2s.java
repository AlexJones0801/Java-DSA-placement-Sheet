// Q4. Sort an array of 0s, 1s and 2s (Dutch National Flag Problem)

public class Q4_Sortarrays0s1s2s {

    public static void main(String[] args) {
        int[] arr = { 0, 2, 1, 0, 2, 1, };

        int low = 0, mid = 0, high = arr.length - 1;

        while (mid <= high) {
            if (arr[mid] == 0) {
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;

                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }

        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}