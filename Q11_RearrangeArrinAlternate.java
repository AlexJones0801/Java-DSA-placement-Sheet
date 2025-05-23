// Q11. Rearrange array in alternating positive & negative items

import java.util.ArrayList;

public class Q11_RearrangeArrinAlternate {
    public static void main(String[] args) {
        int[] arr = { 4, -2, -8, 3, 6, -1, 5 };

        // Separating positive and negative items
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();

        for (int num : arr) {
            if (num >= 0) {
                pos.add(num);
            } else {
                neg.add(num);
            }
        }

        // Merge them Alternately
        int i = 0, j = 0, k = 0;
        while (i < pos.size() && j < neg.size()) {
            arr[k++] = pos.get(i++);
            arr[k++] = neg.get(j++);
        }

        // Adding remaining elements (if any)
        while (i < pos.size()) {
            arr[k++] = pos.get(i++);
        }
        while (j < neg.size()) {
            arr[k++] = neg.get(j++); 
        }

        // Output
        System.out.println("Rearranged Array:");
        for (Integer val : arr) {
            System.out.print(val + " ");
        }
    }
}
