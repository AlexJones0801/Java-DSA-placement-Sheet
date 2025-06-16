// 24. Print all permutations of a string

package Strings;

public class Q24_AllPermutationsofStr {
    public static void permute(String str, int left, int right) {
        if (left == right) {
            System.out.println(str);
        } else{
            for(int i=left;i<=right;i++) {
                str = swap(str, left, i); // swap current index with i
                permute(str, left + 1, right); // Recurse for the rest
                str = swap(str, left, i); // Backtrack (restore original string)
            }
        }
    }

    // Swap characters in a string and return result the resultant string
    public static String swap(String str,int i, int j) {
        char[] charArr = str.toCharArray();
        char temp = charArr[i];
        charArr[i] = charArr[j];
        charArr[j] = temp;
        return String.valueOf(charArr);
    }

    public static void main(String[] args) {
        String str = "abc";
        System.out.println("All permutation ");
        permute(str, 0, str.length() - 1);
    }
}
