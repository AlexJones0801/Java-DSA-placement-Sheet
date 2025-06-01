package Arrays;
// 18. Trapping Rain Water

public class Q18_TrappingRainWater {
    public static void main(String[] args) {
        int[] height = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        int[] leftMax = new int[height.length];
        int[] rightMax = new int[height.length];
        int trappedWater = 0;

        // Filling leftMax Array with maximum height from the left up to that index

        leftMax[0] = height[0];
        for (int i = 1; i <= height.length - 1; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
        }

        // System.out.println("leftMax Array: ");
        // for (int i : leftMax) {
        //     System.out.print(i + " ");
        // }


        // Filling rightMax Array with maximum height from the right up to that index

        rightMax[height.length - 1] = height[height.length - 1];
        for (int i = height.length - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], height[i]);
        }
        // System.out.println("\nrightMax Array: ");
        // for (int i : rightMax) {
        //     System.out.print(i + " ");
        // }


        // Calculate Trapped rain water at each index
        
        for (int i = 0; i <= height.length - 1; i++) {
            int waterAt = Math.min(leftMax[i], rightMax[i]) - height[i];
            if (waterAt > 0) {
                trappedWater += waterAt;
            }
        }

        System.out.println("Trapped Rain Water: " + trappedWater);
    }
}
