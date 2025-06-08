// 22. Check for palindrome

package Strings;

public class Q22_CheckPalindromeStr {
    public static void main(String[] args) {
        String str = "Malayalam";
        str = str.toLowerCase();
        int start = 0, end = str.length() - 1;

        while (start <= end) {
            if (str.charAt(start) == str.charAt(end)) {
                start++;
                end--;
            } else {
                System.out.println(str + " is not Palindrome");
                return;
            }
        }

        if (start >= end) {

            System.out.println(str + " is a Palindrome");
        }
    }
}
