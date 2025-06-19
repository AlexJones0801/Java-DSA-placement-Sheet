// 26. Count and say problem

package Strings;

public class Q26_CountAndSayProblem {
    public static String countandsay(int n) {
        if (n == 1)
            return "1";

        String prev = countandsay(n - 1); // Get previous term
        StringBuilder result = new StringBuilder();

        int count = 1;
        for (int i = 1; i < prev.length(); i++) {
            if (prev.charAt(i) == prev.charAt(i - 1)) {
                count++;
            } else {
                result.append(count).append(prev.charAt(i - 1));
                count = 1;
            }
        }

        // Append the last counted group
        result.append(count).append(prev.charAt(prev.length() -1));
        return result.toString();

    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Count and Say Term " + n + ": " + countandsay(n));
    }
}
