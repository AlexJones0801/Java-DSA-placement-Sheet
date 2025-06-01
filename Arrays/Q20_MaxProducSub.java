package Arrays;
// 20. Maximum Product Subarray

public class Q20_MaxProducSub {
    public static void main(String[] args) {
        int[] nums = { 2, 3, 4, -2, 5 };
        int maxSofar = nums[0];
        int maxEnding = nums[0];
        int minEnding = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < 0) {
                int temp = maxEnding;
                maxEnding = minEnding;
                minEnding = temp;
            }

            maxEnding = Math.max(nums[i], maxEnding * nums[i]);
            minEnding = Math.min(nums[i], minEnding * nums[i]);
            maxSofar = Math.max(maxSofar, maxEnding);
        }

        System.out.println("Maximum Product Subarray: " + maxSofar);
    }
}
