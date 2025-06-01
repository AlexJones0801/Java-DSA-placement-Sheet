package Arrays;
// Q5. Move all negative numbers to beginning and positive to end

public class Q5_negFirstPosEnd {

    public static void main(String[] args) {
        int[] arr = { -1, 2, -3, 4, -5, 6, -7,3 };
        int left = 0, right=arr.length-1;

        while (left <= right) {
            if(arr[left] < 0) { //if element is < 0 do not change anything as it's in the right place
                left++;
            } else if(arr[right]>0){ // if element is > 0 do not change anything as it's in the right place
                right--;
            } else {  // if arr[left] is positive and arr[right] is negative swap them
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}