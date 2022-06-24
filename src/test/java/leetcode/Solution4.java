package leetcode;

import java.util.HashMap;
import java.util.Map;

class Solution4 {

    public static void main(String[] args) {
        System.out.println(convert("PAYPALISHIRING", 3));
    }

    public static String convert(String s, int numRows) {
        Map<Integer, StringBuilder> map = new HashMap<>();

        int pos = 0;
        boolean incr = true;

        for (char c : s.toCharArray()) {

            //it is to change the direction
            if (pos == numRows) {
                incr = false;
            }
            if (pos == 1) {
                incr = true;
            }


            //it is to go through the number of rows
            if (incr) {
                pos++;
            } else {
                pos--;
            }

            if (!map.containsKey(pos)) {
                map.put(pos, new StringBuilder());
            }
            map.get(pos).append(c);
        }

        StringBuilder result = new StringBuilder();
        for (int i : map.keySet()) {
            result.append(map.get(i));
        }
        return result.toString();
    }
}