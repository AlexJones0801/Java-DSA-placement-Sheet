package Arrays;

// 19. Merge two sorted arrays without using extra space
import java.util.Arrays;

public class Q19_Merge2SortedArrayWOUES {
    public static void main(String[] args) {
        int[] arr1 = { 1, 4, 7, 8, 9, 11 };
        int[] arr2 = { 2, 3, 9 };
        int n = arr1.length, m = arr2.length;
        int gap = nextGap(n + m);

        while (gap > 0) {
            int i = 0, j = gap;

            while (j < n + m) {
                int a = (i < n) ? arr1[i] : arr2[i - n];
                int b = (j < n) ? arr1[j] : arr2[j - n];

                if (a > b) {
                    if (i < n && j < n) {
                        // Both in arr1
                        int temp = arr1[i];
                        arr1[i] = arr1[j];
                        arr1[j] = temp;
                    } else if (i < n) {
                        // i in arr1, j in arr2
                        int temp = arr1[i];
                        arr1[i] = arr2[j - n];
                        arr2[j - n] = temp;
                    } else {
                        // Both in arr2
                        int temp = arr2[i - n];
                        arr2[i - n] = arr2[j - n];
                        arr2[j - n] = temp;
                    }
                }

                i++;
                j++;
            }

            gap = nextGap(gap);
        }

        System.out.println("Merged arr1: " + Arrays.toString(arr1));
        System.out.println("Merged arr2: " + Arrays.toString(arr2));
    }

    static int nextGap(int gap) {
        return (gap <= 1) ? 0 : (gap / 2 + gap % 2);
    }
}
