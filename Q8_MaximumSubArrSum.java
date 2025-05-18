// Q8. Kadane's Algorithm - Maximum Subarray Sum

public class Q8_MaximumSubArrSum {
    public static void main(String[] args) {
        int[] arr = { -2, 2, 4, -1, 5, -3, 4, -5, 3 };
        int maxSofar = arr[0], currentMax = arr[0];

        for (int i = 1; i < arr.length; i++) {
            currentMax = Math.max(arr[i], currentMax + arr[i]);
            maxSofar = Math.max(maxSofar, currentMax);
        }
        System.out.println(maxSofar);
    }
}
