package leetcode;

public class Solution11 {

    public static void main(String[] args) {
        System.out.println(isPalindrome("ababa"));
    }

    public static boolean isPalindrome(String s) {
        String f = s.replaceAll("\\s+", "")
                .replaceAll("\\p{Punct}", "")
                .toLowerCase();
        char[] str = f.toCharArray();

        for (int i = 0; i < str.length/2; i++) {
            if (str[i] != str[str.length - i - 1]) {
                return false;
            }
        }
        return true;
    }
}
