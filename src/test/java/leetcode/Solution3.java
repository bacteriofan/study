package leetcode;

class Solution3 {

    public static int resultStart = 0;
    public static int resultLength = 0;

    public static void main(String[] args) {
        System.out.println(longestPalindrome("cbbd"));
    }

    public static String longestPalindrome(String s) {

        for (int i = 0; i < s.length() - 1; i++) {
            expand(s, i, i); // i это центр строки. в случае четных чисел, нам надо две буквы для обозначения центра
            expand(s, i, i + 1);

        }
        return s.substring(resultStart, resultStart + resultLength);
    }

    // проверка побуквенно от центра к краям
    static void expand(String s, int begin, int end) {

        while (begin >= 0 && end < s.length() && s.charAt(begin) == s.charAt(end)) {
            begin--;
            end++;
        }

        //returns the longest palindrome was found here with the one found before. Here we need to restore the values that were precessed in the last loop above
       if (resultLength < end - begin - 1) {
           resultStart = begin + 1;
           resultLength = end - begin - 1;
       }
    }
}