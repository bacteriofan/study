package leetcode;

class Solution2 {

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcc"));
    }

    public static int lengthOfLongestSubstring(String s) {

        String max_str = "";
        int max_len = 0;
        if (s.isEmpty()) {
            return 0;
        }
        for (char ch : s.toCharArray()) {
            String current = String.valueOf(ch);
            if (max_str.contains(current)) {
                max_str = max_str.substring(max_str.indexOf(current) + 1);
            }
            max_str = max_str + current;
            max_len = Math.max(max_str.length(), max_len);
        }
        return max_len;
    }
}