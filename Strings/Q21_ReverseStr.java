// 21. Reverse a string

package Strings;

public class Q21_ReverseStr {
    public static void main(String[] args) {
        String str = "Reverse";
        char[] strArr = str.toCharArray();

        int start = 0,end=str.length()-1;
        while (start <= end) {
            char temp = strArr[start];
            strArr[start] = strArr[end];
            strArr[end] = temp;

            start++;
            end--;
        }

        str = new String(strArr);
        System.out.println(str);
    }
}
