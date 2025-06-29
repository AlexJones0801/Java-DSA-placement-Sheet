package Arrays;
// Q2. Reverse an array in place

public class Q2_ReverseArray {
    public static void main(String[] args) {
        int[] arr = {2,5,6,7,3,9};
        int start=0,end=arr.length-1;

        while (start<end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
    }
}