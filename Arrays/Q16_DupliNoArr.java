package Arrays;
// 16. Find duplicate number in array

import java.util.HashSet;

public class Q16_DupliNoArr {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 2, 3, 5, 3 };

        HashSet<Integer> set = new HashSet<>();

        for (int i : arr) {
            if (set.contains(i)) {
                System.out.println("Duplicate: " + i);
            } else {
                set.add(i);
            }
        }
    }
}
