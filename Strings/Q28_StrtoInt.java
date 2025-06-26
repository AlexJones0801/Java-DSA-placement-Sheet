// 28. Convert string to integer (like atoi)

package Strings;

public class Q28_StrtoInt {
    public static void main(String[] args) {
        String str = "  +57 _number";
        int result = 0, i = 0, sign = 1;
        int n = str.length();

        // Skip leading whitespaces
        while (i < n && str.charAt(i) == ' ') {
            i++;
        }

        // Check the sign
        if (i < n && (str.charAt(i) == '+' || str.charAt(i) == '-')) {
            sign = (str.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        // Convert digits to integer
        while (i < n && Character.isDigit(str.charAt(i))) {
            int digit = str.charAt(i) - '0';

            // Handling overflow/underflow
            if (result > (Integer.MAX_VALUE - digit) / 10) {
                result = (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                System.out.println(result);
                return;
            }

            result = result * 10 + digit;
            i++;
        }

        result *= sign;
        System.out.println(result);
    }
}
