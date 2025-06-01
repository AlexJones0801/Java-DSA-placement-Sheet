package Arrays;
// 12. Count the number of occurrences of an element

public class Q12_CountNoOfOccOfAnElem {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 1, 5, 3, 3, 5 };
        int target = 3, count = 0; // Target element whose occurrence we will find

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == target) {
                count++;
            }
        }

        System.out.println("Target element " + target + " occurrence is " + count);
    }
}
