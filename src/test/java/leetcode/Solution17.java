package leetcode;

public class Solution17 {

    public static void main(String[] args) {
        reverseString(new char[] {'h','e','l','l','o'});
    }

    public static void reverseString(char[] s) {
        for (int i = 0, j = s.length - 1; i < j; i++, j--) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
        }
    }
}
