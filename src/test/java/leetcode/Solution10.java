package leetcode;

public class Solution10 {

    public static void main(String[] args) {
        System.out.println(isPalindrome("ababa"));
    }

    public static boolean isPalindrome(String s) {
        char[] str = s.toCharArray();
        for (int i = 0; i < str.length/2; i++) {
            if (str[i] != str[str.length - i - 1]) {
                return false;
            }
        }
        return true;
    }
}
