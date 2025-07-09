// 31. Compress the string (like Leetcode 443)

package Strings;

public class Q31_CompressString {
    public static void main(String[] args) {
        String str = "aabccccaaa";
        StringBuilder result = new StringBuilder();
        int count = 1;

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                result.append(str.charAt(i)).append(count);
                count = 1;
            }
        }
        result.append(str.charAt(str.length() - 1)).append(count);
        System.out.println(result);
    }
}
