// 30. Valid Palindrome after removing at most one character

package Strings;

import java.util.Scanner;

public class Q30_ValidPalinARAMOC {
    public static boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = in.nextLine();
        str = str.toLowerCase();
        in.close();

        // Pointers
        int start = 0, end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start) == str.charAt(end)) {
                start++;
                end--;
            } else {
                // Try skipping either start or end character
                if (isPalindrome(str, start + 1, end) || isPalindrome(str, start, end - 1)) {
                    System.out.println(str + " is Valid Palindrome");
                } else {

                    System.out.println(str + " is Not a Valid Palindrome");
                }
                return;
            }
        }

        System.out.println("Valid Palindrome");
    }
}
