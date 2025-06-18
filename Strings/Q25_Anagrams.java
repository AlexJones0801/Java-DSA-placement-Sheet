// 25. Check if two strings are anagrams(anagrams means both string contains same character in any order)

package Strings;

import java.util.HashMap;

public class Q25_Anagrams {

    public static void main(String[] args) {
        String str = "Hello", str2 = "olelH";

        HashMap<Character, Integer> map = new HashMap<>();
        if (str.length() == str.length()) {
            for (char c : str.toCharArray()) {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }

            for (char c : str2.toCharArray()) {
                if (!map.containsKey(c) || map.get(c) == 0) {
                    System.out.println("Not an anagram");
                    return;
                }
                map.put(c,map.get(c)-1);
            }

            // After the loop, check if all count are zero
            for (int count : map.values()) {
                if (count != 0) {
                    System.out.println("Not an Anagram");
                    return;
                }
            }
            System.out.println("Anagram");
        } else {
            System.out.println("Not an anagram");
        }
    }
}