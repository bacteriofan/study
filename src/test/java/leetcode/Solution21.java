package leetcode;

public class Solution21 {

    public static void main(String[] args) {
        //System.out.println(isSubsequence());
    }


    public static boolean isSubsequence(String s, String t) {
        char[] sequence = t.toCharArray();
        char[] substring = t.toCharArray();
        int j = 0;
        for (int i = 0; i < sequence.length && j < substring.length; i++) {
            if (sequence[i] == substring[j]) {
                j++;
            }
        }

        return j == substring.length;
    }

}