// 29. Implement strstr() (substring search)

package Strings;

public class Q29_ImplementSubstringsearch {
    public static void main(String[] args) {
        String str = "Ryan Reynolds is best", substr = "Reynolds";

        if (str.isEmpty() || substr.isEmpty()) {
            System.out.println("String is Empty");
            return;
        }

        int index = -1;

        for (int i = 0; i <= str.length() - substr.length(); i++) {
            int j;
            for (j = 0; j < substr.length(); j++) {
                if (str.charAt(i + j) != substr.charAt(j)) {
                    break;
                }
            }
            if (j == substr.length()) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.println("Substring: " + substr + " starts at index " + index);
        } else {
            System.out.println("Substring not found");
        }
    }
}
