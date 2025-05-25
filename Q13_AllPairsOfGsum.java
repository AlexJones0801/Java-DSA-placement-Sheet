// 13. Find all pairs with a given sum

import java.util.HashSet;

public class Q13_AllPairsOfGsum {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 4, -7, 8, 5 };
        int k = 9;

        HashSet<Integer> seen = new HashSet<>();

        System.out.println("Pairs with sum " + k + ":");
        for (Integer num : arr) {
            int complement = k - num;
            if (seen.contains(complement)) {
                System.out.println(num + " , " + complement);
            }
            seen.add(num);
        }
    }
}
