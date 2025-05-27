// 15. Missing number in array [1 to n]

public class Q15_MissingNoArr {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5, 6, 7, 8 };
        int n = arr.length + 1, actualSum = 0;
        int totalSum = n * (n + 1) / 2;

        for (int i = 0; i < arr.length; i++) {
            actualSum += arr[i];
        }
        System.out.println("Missing Number: " + (totalSum - actualSum));
    }
}
