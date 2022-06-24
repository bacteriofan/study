package leetcode;

class Solution8 {

    public static void main(String[] args) {
        System.out.println(strStr("hello", "ll"));
    }

    //вернуть индекс первого символа иглы
    public static int strStr(String haystack, String needle) {
        if (needle.isEmpty()) return 0;

        char[] haystackArray = haystack.toCharArray();
        char[] needleArray = needle.toCharArray();

        for (int i = 0; i <= haystackArray.length - needleArray.length; i++) {
            for (int j = 0; j < needleArray.length; j++) {
                if (haystackArray[i + j] != needleArray[j]) {
                   break;
                }
                if (j == needleArray.length - 1) {
                    return i;
                }
            }
        }

        return -1;
    }
}