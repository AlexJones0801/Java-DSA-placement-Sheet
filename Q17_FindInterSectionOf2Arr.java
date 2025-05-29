// 17. Find intersection of two sorted arrays

import java.util.ArrayList;
import java.util.Arrays;

public class Q17_FindInterSectionOf2Arr {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 4, 5, 6 }, arr2 = { 2, 3, 7, 4 };

        // Optional: Sort Array if needed
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Convert arr1 to Array List
        ArrayList<Integer> list = new ArrayList<>();
        for (Integer i : arr1) {
            list.add(i);
        }

        // Finding Intersection
        System.out.println("Intersection: ");
        for (Integer num : arr2) {
            if (list.contains(num)) {
                System.out.print(num + " ");
                list.remove((Integer) num); // Remove to avoid duplicate printing
            }            
        }
    }
}
