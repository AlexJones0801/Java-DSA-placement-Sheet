package Arrays;
// Q10. Leaders in an array

public class Q10_LeaderInArr {
    public static void main(String[] args) {
        int[] arr = {16,8,4,2,9,2};
        int[] leaders = new int[arr.length];
        int maxRight =arr[arr.length-1],k=0;
        leaders[k++] = maxRight;

        for(int i =arr.length-2; i >=0 ; i--) {
            if (arr[i] >= maxRight) {
                maxRight = arr[i];
                leaders[k++] = arr[i];
            }
        }

        for (int i= k-1 ; i >= 0 ; i--) {
            System.out.print(leaders[i] + " ");
        }
    }
}
