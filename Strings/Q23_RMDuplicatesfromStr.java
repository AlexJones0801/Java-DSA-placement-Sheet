// 23. Remove duplicates from a string

package Strings;

import java.util.HashSet;

public class Q23_RMDuplicatesfromStr {

    public static void main(String[] args) {
        String str = "Tanng";
        StringBuilder result = new StringBuilder();

        HashSet<Character> set = new HashSet<>();

        for (char c : str.toCharArray()) {
            if (!set.contains(c)) {
                set.add(c);
                result.append(c);
            }
        }

        System.out.println(result.toString());
    }
}