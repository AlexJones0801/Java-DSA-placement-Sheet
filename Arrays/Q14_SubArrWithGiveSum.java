package Arrays;
// 14. Subarray with given sum (Two pointer / Sliding window)

public class Q14_SubArrWithGiveSum {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 20, 3, 10, 5 };
        int targetSum = 33, start = 0, currentSum = 0;
        boolean found = false;

        for (int end = 0; end < arr.length; end++) {
            currentSum += arr[end];

            // Shrink the window from the left if currentSum > targetSum
            while (currentSum > targetSum && start < end) {
                currentSum -= arr[start];
                start++;
            }

            // Checking if current Window has the target sum
            if (currentSum == targetSum) {
                System.out.println("Subarray found from index " + start + " to " + end);
                found = true;
                break;
            }

        }

        if (!found) {
            System.out.println("No subarray with given sum found.");
        }
    }
}
